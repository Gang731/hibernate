package com.sun.service;

import com.sun.entity.Users;

import java.util.List;

public interface UserService {
    Users getByIdUser(int id);

    void add(Users users);

    void del(Users id);

    void update(Users users);

    List<Users> getall();

}
