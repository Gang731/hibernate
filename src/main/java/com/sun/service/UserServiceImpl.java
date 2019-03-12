package com.sun.service;

import com.sun.entity.Users;
import com.sun.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.io.Serializable;
import java.util.List;

public class UserServiceImpl implements UserService {

    public Users getByIdUser(int id) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();
        Users users = session.get(Users.class, new Integer(id));
        return users;
    }

    public void add(Users users) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();
        session.save(users);
        transaction.commit();
    }

    public void update(Users users) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();
        session.update(users);
        transaction.commit();
    }

    public void del(Users id) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(id);
        transaction.commit();
    }

    public List<Users> getall() {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();
        return session.createQuery("from Users").list();
    }
}
