package com.twg.liberty.service.impl;

import com.twg.liberty.model.User;
import com.twg.liberty.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class SimpleUserService implements UserService {

    private Map<Integer, User> userStorage = new HashMap<>();

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
        int id = userStorage.size() + 1;
        userStorage.put(id, new User(id, login, 0, 0));
        return id;
    }

    @Override
    public User getUser(int id) {
        return userStorage.get(id);
    }

    @Override
    public List<User> getUsers() {
        return new LinkedList();
    }

    public User updateUser(int userId, User user) {
        User storedUser = userStorage.get(userId);
        userStorage.put(userId, user);
        return storedUser;
    }

    @Override
    public void removeUser(int id) {
        userStorage.remove(id);
    }

}
