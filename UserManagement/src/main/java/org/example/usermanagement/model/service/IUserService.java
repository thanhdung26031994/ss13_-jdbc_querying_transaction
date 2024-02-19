package org.example.usermanagement.model.service;

import org.example.usermanagement.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void addUser(User user);


    void updateUser(User user);

    User getById(Integer id);

    void moveById(Integer id);
}
