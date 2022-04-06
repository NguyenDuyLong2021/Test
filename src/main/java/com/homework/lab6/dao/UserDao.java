package com.homework.lab6.dao;

import com.homework.lab6.beans.User;
import com.homework.lab6.db.DataConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static UserDao userDao = null;

    private UserDao() {
    }

    public static UserDao getInstance() {
        if (userDao == null) {
            return userDao = new UserDao();
        }
        return userDao;
    }

    public User getUserCheckLogin(String name, String password) {
        try {
            ResultSet resultSet = DataConnector.connect().executeQuery("SELECT * FROM user WHERE name_user='" + name + "'AND password= '" + password + "'");
            User user = null;
            if (resultSet.next()) {
                user = new User();
                user.setFullName(resultSet.getString("fullname"));
                user.setUserName(resultSet.getString("name_user"));
            }
            if (user != null && user.getUserName().equals(name) && !resultSet.next()) {
                return user;
            }
            return null;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Day la ngoai le " + e);
            return null;
        }
    }

    public int addUser(String fullname, String name_user, String password, int age) {
        try {
            int row = DataConnector.connect().executeUpdate("insert into user(fullname, name_user, password, age) values('" + fullname + "','" + name_user + "','" + password + "','" + age + "')");
            return row;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Day la ngoai le " + e);
            return 0;
        }
    }
}
