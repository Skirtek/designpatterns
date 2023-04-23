package com.codecool.mvc;

public class MvcRunner {
    public static void run() {
        // Create Model
        User user = new User("John", 30);

        // Create View
        UserView userView = new UserView();

        // Create Controller and display user data
        UserController userController = new UserController(user, userView);
        userController.displayCurrentUserDetails();

        // Update user data and refresh view
        userController.updateUserDetails("Jane", 25);
    }
}
