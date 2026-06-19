package com.example.employeedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {

    private SessionFactory sessionFactory;

    
    // Constructor
    public EmployeeDAO() {

        sessionFactory = Utility.getSessionFactory();

    }


    // Get Session
    private Session getSession() {

        return sessionFactory.openSession();

    }


    // Save Employee
    public void save(Employee e) {

        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.persist(e);

        tx.commit();

        session.close();

    }


    // Find Employee By Id
    public Employee findById(int id) {

        Session session = getSession();

        Employee e =
                session.find(Employee.class, id);

        session.close();

        return e;

    }


    // Find All Employees
    public List<Employee> findAll() {

        Session session = getSession();

        List<Employee> employees =
                session.createQuery(
                        "from Employee",
                        Employee.class)
                .list();

        session.close();

        return employees;

    }


    // Update Employee
    public void update(Employee e) {

        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.merge(e);

        tx.commit();

        session.close();

    }


    // Delete Employee
    public void delete(int id) {

        Session session = getSession();

        Transaction tx = session.beginTransaction();

        Employee e =
                session.find(Employee.class, id);

        if (e != null) {

            session.remove(e);

        }

        tx.commit();

        session.close();

    }

}