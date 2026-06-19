package com.example.employeedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {

    private static SessionFactory sessionFactory;

    static {

        try {

            sessionFactory =
                    new Configuration()
                    .configure()
                    .buildSessionFactory();

            System.out.println("SessionFactory Created");

        }

        catch (Exception e) {

            System.out.println("Hibernate Error");

            e.printStackTrace();

        }

    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;

    }

}