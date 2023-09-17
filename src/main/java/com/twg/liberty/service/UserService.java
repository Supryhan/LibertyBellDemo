package com.twg.liberty.service;
import com.twg.liberty.model.User;

import java.util.List;

public interface UserService {

    boolean login(String login, String pass);

    boolean logout();

    int addUser(String login, String pass);

    User getUser(int id);

    List<User> getUsers();

    User updateUser(int userId, User user);

    void removeUser(int id);
}
