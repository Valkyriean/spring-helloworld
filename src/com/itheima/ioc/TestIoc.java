package com.itheima.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//@Service
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestIoc {
    //@Resource(name = "UserDao")
    @Autowired
    private UserDao ud;

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    @Test
    public void fun1(){
        ud.say();
    }
    /*public static void main(String[] args) {
        //初始化spring容器，加载配置文件
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取userDao实例
        //UserDao userDao = (UserDao) applicationContext.getBean("UserDao");

        //调用say方法
        ud.say();
    }*/
}