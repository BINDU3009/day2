package com.example.librarysystem;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LibraryDAO {

    private SessionFactory sessionFactory;


    // Constructor
    public LibraryDAO() {

        sessionFactory = Utility.getSessionFactory();

    }


    // Get Session
    private Session getSession() {

        return sessionFactory.openSession();

    }


    // Save Book
    public void save(Library l) {

        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.persist(l);

        tx.commit();

        session.close();

    }


    // Find Book By Id
    public Library findById(int id) {

        Session session = getSession();

        Library l =
                session.find(Library.class, id);

        session.close();

        return l;

    }


    // Find All Books
    public List<Library> findAll() {

        Session session = getSession();

        List<Library> library =
                session.createQuery(
                        "from Library",
                        Library.class)
                .list();

        session.close();

        return library;

    }


    // Update Book
    public void update(Library l) {

        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.merge(l);

        tx.commit();

        session.close();

    }


    // Delete Book
    public void delete(int id) {

        Session session = getSession();

        Transaction tx = session.beginTransaction();

        Library l =
                session.find(Library.class, id);

        if (l != null) {

            session.remove(l);

        }

        tx.commit();

        session.close();

    }

}