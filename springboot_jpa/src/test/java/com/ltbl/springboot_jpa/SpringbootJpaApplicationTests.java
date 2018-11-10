package com.ltbl.springboot_jpa;

import com.ltbl.springboot_jpa.dao.PermiDao;
import com.ltbl.springboot_jpa.dao.RoleDao;
import com.ltbl.springboot_jpa.domain.Tb_Role;
import com.ltbl.springboot_jpa.domain.Tb_permissions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class SpringbootJpaApplicationTests {



    @Autowired
    public RoleDao roleDao;

    @Autowired
    public PermiDao permiDao;

//    @Test
//    @Transactional
//    @Rollback(false)
//    public void add() {
//        Tb_User tb_user = new Tb_User();
//        tb_user.setUsername("xiaoxaio");
//        tb_user.setPassword("123456");
//        tb_user.setName("小小");
//
//        Tb_Role tbRole = new Tb_Role("学生");
//        Tb_Role tbRole1 = new Tb_Role("少先队员");
//
//        tb_user.getRoles().add(tbRole);
//        tb_user.getRoles().add(tbRole1);
//
////        tbRole.setTbUser(tb_user);
////        tbRole1.setTbUser(tb_user);
//
//        userDao.save(tb_user);
//        roleDao.save(tbRole);
//        roleDao.save(tbRole1);
//    }

    @Test
    @Transactional
    @Rollback(false)
    public void addmany(){

        Tb_permissions permissions = new Tb_permissions("1级权限");
        Tb_permissions permissions2 = new Tb_permissions("2级权限");
        Tb_permissions permissions3 = new Tb_permissions("3级权限");
        Tb_permissions permissions4 = new Tb_permissions("4级权限");

        Tb_Role tb_role = new Tb_Role("访客");
        Tb_Role tb_role2 = new Tb_Role("管理员");

        tb_role.getTb_permissions().add(permissions);
        tb_role.getTb_permissions().add(permissions2);


        tb_role2.getTb_permissions().add(permissions);
        tb_role2.getTb_permissions().add(permissions2);
        tb_role2.getTb_permissions().add(permissions3);
        tb_role2.getTb_permissions().add(permissions4);

        permiDao.save(permissions);
        permiDao.save(permissions2);
        permiDao.save(permissions3);
        permiDao.save(permissions4);

        roleDao.save(tb_role);
        roleDao.save(tb_role2);
    }

    @Test
    public void findbyid(){
        Tb_Role tb_role = roleDao.findById(2L).get();
        System.out.println(tb_role);
        Set<Tb_permissions> tb_permissions = tb_role.getTb_permissions();
        for (Tb_permissions tb_permission : tb_permissions) {
            System.out.println(tb_permission);
        }
    }

}
