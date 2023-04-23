package com.codecool.di;

public class DiRunner {
    public static void run() {
        // Constructor
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        // We can create more than one instance based on dependency
        UserService userService2 = new UserService(userRepository);

        // Setter
        UserController userController = new UserController();
        userController.setUserService(userService);
    }
}
