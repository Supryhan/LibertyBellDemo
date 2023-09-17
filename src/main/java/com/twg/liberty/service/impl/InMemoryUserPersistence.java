package com.twg.liberty.service.impl;

import com.twg.liberty.model.User;
import com.twg.liberty.service.UserPersistence;
import lombok.val;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryUserPersistence implements UserPersistence {

    private Map<Integer, User> userStorage = new HashMap<>();

    @Override
    public User create(String login, String pass) {
        int id = userStorage.size() + 1;
        userStorage.put(id, new User(id, login, 100, 0));
        return userStorage.get(id);
    }

    @Override
    public User read(int id) {
        return userStorage.getOrDefault(id, new User(-1, "notExisting user", 0, 0));
    }

    public List<User> read() {
        List<User> users = new LinkedList<>();
        for (Map.Entry<Integer, User> entry : userStorage.entrySet()) {
            users.add(entry.getValue());
        }
        return users;
    }

    @Override
    public User update(int id, User user) {
        User storedUser = userStorage.get(id);
        userStorage.put(id, user);
        return storedUser;
    }

    @Override
    public void delete(int id) {
        userStorage.remove(id);
    }
}
