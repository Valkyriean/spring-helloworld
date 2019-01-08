package com.itheima.ioc;

import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("UserDao say hello world!");
    }
}
