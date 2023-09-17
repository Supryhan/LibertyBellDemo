package com.twg.liberty.service.impl;

import com.twg.liberty.model.User;
import com.twg.liberty.service.UserPersistence;
import com.twg.liberty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class SimpleUserService implements UserService {

    @Autowired
    UserPersistence userPersistence;

    @Override
    public boolean login(String login, String pass) {
        return true;
    }

    @Override
    public boolean logout() {
        return true;
    }

    @Override
    public int addUser(String login, String pass) {
        System.out.println("new user logged in");
        User newUser = userPersistence.create(login, pass);
        return newUser.getId();
    }

    @Override
    public User getUser(int id) {
        return userPersistence.read(id);
    }

    @Override
    public List<User> getUsers() {
        return userPersistence.read();
    }

    public User updateUser(int userId, User user) {
        User storedUser = userPersistence.update(userId, user);
        return storedUser;
    }

    @Override
    public void removeUser(int id) {
        userPersistence.delete(id);
    }

}
