package com.codecool.di;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(int userId) {
        return userRepository.getUser(userId);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }
}
