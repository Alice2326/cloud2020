package com.atguigu.springcloud;

import com.atguigu.springcloud.controller.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class MyTest {

    @Resource
    private User user;

    @Test
    public void test(){
//        String s= "01234";
//        String s1 = "12";
//        System.out.println(s.indexOf("12"));
        System.out.println(user);
    }
}
