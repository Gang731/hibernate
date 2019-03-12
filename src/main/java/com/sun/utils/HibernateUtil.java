package com.sun.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static  Configuration configure =null;
    private static   SessionFactory sessionFactory =null;
    static{
        try{
            configure = new Configuration().configure();
            sessionFactory = configure.buildSessionFactory();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }
    }
    //获取Session对象
    public static Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
}
