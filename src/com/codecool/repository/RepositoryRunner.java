package com.codecool.repository;

public class RepositoryRunner {
    public static void run() {
        UserRepository userRepository = new UserRepositoryImpl();

        // Example usage of the repository
        User user = userRepository.getById("123");
        user.setName("John");
        userRepository.update(user);
    }
}
