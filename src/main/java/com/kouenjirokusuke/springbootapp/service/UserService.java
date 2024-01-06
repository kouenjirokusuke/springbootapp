package com.kouenjirokusuke.springbootapp.service;

import com.kouenjirokusuke.springbootapp.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void saveUser(User user);
    User getUser(long id);
    void deleteUser(long id);

}
