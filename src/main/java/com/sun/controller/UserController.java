package com.sun.controller;


import com.sun.entity.Users;
import com.sun.service.UserService;
import com.sun.service.UserServiceImpl;
import org.junit.Test;

import java.util.List;


public class UserController {

    public static void main(String[] args) {
        //查询id为1的用户信息
        Users users = new Users();
        users.setId(1);
        int id = (int)users.getId();
        UserService userService = new UserServiceImpl();
        Users u = userService.getByIdUser(id);
        System.out.println(u);
    }
    @Test
    //增加用户
    public void add(){
        UserService userService = new UserServiceImpl();
        Users users = new Users(3,"qwe","111111","1234","张三","NO");
        userService.add( users);
        System.out.println(users);
    }
    //删除用户
    @Test
    public void del(){
        UserService userService = new UserServiceImpl();
        Users users = new Users(3,null,null,null,null,null);
        userService.del(users);
        System.out.println(users);
    }
    @Test
    public void update(){
        UserService userService = new UserServiceImpl();
        Users users = new Users(3,"qaz","123123","121212","李四","yes");
        userService.update(users);
        System.out.println(users);
    }
    //查询所有
    @Test
    public void query(){
        UserService userService = new UserServiceImpl();
        List<Users> u = userService.getall();
        for (Users users : u) {
            System.out.println(u);
        }
    }
}
