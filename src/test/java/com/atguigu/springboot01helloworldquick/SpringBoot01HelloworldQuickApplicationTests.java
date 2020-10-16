package com.aiguigu.springboot;

import com.aiguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
SpringBoot单元测试;
可以在测试期间很方便的类似编码一样自动注入功能
* */

@SpringBootTest
class SpringBoot02ConfigApplicationTests {
    
    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
