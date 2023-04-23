package com.codecool.di;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser(int userId) {
        return userService.getUser(userId);
    }

    public void updateUser(User user) {
        userService.updateUser(user);
    }
}
