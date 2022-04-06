package com.homework.lab6.services;

import com.homework.lab6.beans.User;
import com.homework.lab6.dao.UserDao;

public class UserService {
    private static UserService userService = null;

    private UserService() {
    }

    public static UserService getInstance() {
        if (userService == null) {
            return userService = new UserService();
        }
        return userService;
    }

    public boolean checkLogin(String userName, String password) {
        User user = UserDao.getInstance().getUserCheckLogin(userName, password);
        return user != null;
    }

    public boolean rigister(String fullname, String name_user, String password, int age) {
        return UserDao.getInstance().addUser(fullname, name_user, password, age) == 1;
    }
}
