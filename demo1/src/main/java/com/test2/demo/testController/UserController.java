package com.test2.demo.testController;

import com.test2.demo.domain.Tb_User;
import com.test2.demo.testDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserDao userDao;

    @RequestMapping("/findAll")
    public List<Tb_User> findAll(){
        List<Tb_User> tb_users = userDao.selectAll();
//        List<Tb_User> all = userDao.findAll();
        return tb_users;
    }
}
