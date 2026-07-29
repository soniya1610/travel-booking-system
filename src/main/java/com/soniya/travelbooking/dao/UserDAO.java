package com.soniya.travelbooking.dao;

// Hibernate Imports
import org.hibernate.Session;
import org.hibernate.Transaction;

// Project Imports
import com.soniya.travelbooking.model.*;
import com.soniya.travelbooking.util.*;

public class UserDAO {

    // Save User
    public boolean saveUser(User user) {

        Transaction transaction = null;

        try (Session session = HbUtil.getSessionFactory().openSession()) {

            // Start Transaction
            transaction = session.beginTransaction();

            // Save Object
            session.persist(user);

            // Commit Transaction
            transaction.commit();

            return true;

        } catch (Exception e) {

            // Rollback if any error occurs
            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

            return false;
        }
    }

}