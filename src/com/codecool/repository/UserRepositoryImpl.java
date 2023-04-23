package com.codecool.repository;

import java.util.List;

// Concrete repository implementation
public class UserRepositoryImpl implements UserRepository {
    // Implementation of the UserRepository interface
    // ... data access logic, e.g., connecting to database, making API calls, etc.

    @Override
    public User getById(String id) {
        User user = new User();
        user.setId(id);

        return user;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
