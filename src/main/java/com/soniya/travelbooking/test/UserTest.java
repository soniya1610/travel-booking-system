package com.soniya.travelbooking.test;

import com.soniya.travelbooking.model.User;
import com.soniya.travelbooking.service.UserService;

public class UserTest {

    public static void main(String[] args) {

        User user = new User();

        user.setFullName("Soniya Meena");
        user.setEmail("soniya2@gmail.com");
        user.setPhone("9876543211");
        user.setPassword("123456");
        user.setRole("USER");

        UserService service = new UserService();

        boolean status = service.registerUser(user);

        if (status) {
            System.out.println("User Registered Successfully!");
        } else {
            System.out.println("Registration Failed!");
        }
    }
}