package com.twg.liberty.service;

import com.twg.liberty.model.User;

import java.util.List;

public interface UserPersistence {

    User create(String login, String pass);

    User read(int id);

    List<User> read();

    User update(int id, User user);

    void delete(int id);
}
