package com.sun.test;

import com.sun.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Test01 {
    public static void main(String[] args) {
        //加载配置文件
        Configuration configure = new Configuration().configure();
        //创建连接工厂
        SessionFactory sessionFactory = configure.buildSessionFactory();
        //获取连接对象
        Session session = sessionFactory.openSession();
        //执行访问
        Users users = session.get(Users.class, 1);
        System.out.println(users);
    }

}
