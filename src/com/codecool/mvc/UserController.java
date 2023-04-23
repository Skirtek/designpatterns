package com.codecool.mvc;

public class UserController {
    private User user;
    private UserView userView;

    public UserController(User user, UserView userView) {
        this.user = user;
        this.userView = userView;
    }

    public void displayCurrentUserDetails(){
        userView.displayUserDetails(user.getName(), user.getAge());
    }

    // Update user data and refresh view
    public void updateUserDetails(String name, int age) {
        user.setName(name);
        user.setAge(age);
        userView.displayUserDetails(user.getName(), user.getAge());
    }
}
