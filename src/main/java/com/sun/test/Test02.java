package com.sun.test;

import com.sun.entity.Users;
import com.sun.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;


public class Test02 {

    //增加用户
    @Test
    public void mm(){
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();
        Users users = new Users(3,"qwe","111111","1234","张三","NO");
        System.out.println(users);
        session.save(users);
        transaction.commit();

    }
}
