package com.soniya.travelbooking.util;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.soniya.travelbooking.model.User;

public class HbUtil {

    private static SessionFactory sessionFactory;

    static {

        try {

            Configuration cfg = new Configuration();

            Properties p = new Properties();

            p.put(Environment.DRIVER,
                    "com.mysql.cj.jdbc.Driver");

            p.put(Environment.URL,
                    "jdbc:mysql://localhost:3306/travel_booking?createDatabaseIfNotExist=true");

            p.put(Environment.USER, "root");

            p.put(Environment.PASS, "Soniya@2005");

            p.put(Environment.DIALECT,
                    "org.hibernate.dialect.MySQLDialect");

            p.put(Environment.HBM2DDL_AUTO, "update");

            p.put(Environment.SHOW_SQL, "true");

            p.put(Environment.FORMAT_SQL, "true");

            cfg.setProperties(p);

            cfg.addAnnotatedClass(User.class);
//            cfg.addAnnotatedClass(Flight.class);

            sessionFactory = cfg.buildSessionFactory();

            System.out.println("Hibernate Connected Successfully");

        } catch (Exception e) {

            e.printStackTrace();

            throw new ExceptionInInitializerError(e);
        }

    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }

}