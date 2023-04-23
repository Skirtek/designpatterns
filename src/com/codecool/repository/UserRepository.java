package com.codecool.repository;

import java.util.List;

public interface UserRepository {
    User getById(String id);
    List<User> getAll();
    void save(User user);
    void update(User user);
    void delete(User user);
}
