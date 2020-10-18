package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import com.atguigu.springboot.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

/*
SpringBoot单元测试;

可以在测试期间很方便的类似编码一样自动注入功能
* */

@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    public void testHelloService(){
        boolean b=ioc.containsBean("helloservice");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }


}
