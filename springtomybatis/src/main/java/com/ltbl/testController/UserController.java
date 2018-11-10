package com.ltbl.testController;

import com.ltbl.domain.Tb_User;
import com.ltbl.testDao.UserDao;
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
//        List<Tb_User> tb_users = userDao.selectAll();
//        System.out.println(tb_users);
//        return tb_users;
            return null;
    }
}
