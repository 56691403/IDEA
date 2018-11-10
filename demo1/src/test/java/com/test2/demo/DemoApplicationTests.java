package com.test2.demo;

import com.test2.demo.domain.Tb_User;
import com.test2.demo.testDao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    public UserDao userDao;

    @Test
    public void contextLoads() {

        List<Tb_User> all = userDao.findAll();
        System.out.println(all);
    }

}
