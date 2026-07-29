package com.soniya.travelbooking.service;

// Project Imports
import com.soniya.travelbooking.dao.UserDAO;
import com.soniya.travelbooking.model.User;

public class UserService {

    private UserDAO userDAO;

    // Constructor
    public UserService() {
        userDAO = new UserDAO();
    }

    // Register User
    public boolean registerUser(User user) {

        // Later we'll add:
        // Email validation
        // Phone validation
        // Password encryption
        // Duplicate email check

        return userDAO.saveUser(user);
    }
}