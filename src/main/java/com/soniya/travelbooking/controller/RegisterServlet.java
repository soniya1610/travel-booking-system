package com.soniya.travelbooking.controller;

// Java Imports
import java.io.IOException;

// Servlet Imports
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Project Imports
import com.soniya.travelbooking.model.User;
import com.soniya.travelbooking.service.UserService;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private UserService userService;

    @Override
    public void init() throws ServletException {

        userService = new UserService();

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Read form data
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        // Create User Object
        User user = new User();

        user.setFullName(fullName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setPassword(password);
        user.setRole("USER");

        // Save User
        boolean status = userService.registerUser(user);

        if (status) {

            response.sendRedirect("auth/login.jsp");

        } else {

            response.getWriter().println("<h2>Registration Failed!</h2>");
        }
    }
}