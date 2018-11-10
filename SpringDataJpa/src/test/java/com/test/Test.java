package com.test;

import com.ltbl.dao.DataJpaDao;
import com.ltbl.domain.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class Test {

    @Autowired
    private DataJpaDao dataJpaDao;

    @org.junit.Test
    @Transactional
    public void save(){
////        User user = new User();
//        user.setUsername("抽烟喝酒烫头");
//        user.setPassword("123456");
//        dataJpaDao.save(user);
    }

    @org.junit.Test
    @Transactional
    @Commit
    public void update(){
//        User user = new User();
//        user.setId(2L);
//        user.setUsername("小刚子");
//        user.setPassword("123456");
//        dataJpaDao.save(user);
    }

    @org.junit.Test
    public void findAll(){
        List<User> all = dataJpaDao.findAll();
        System.out.println(all);
    }

    @org.junit.Test
    public void findAllPage(){
        Pageable pageable = new PageRequest(1,2);
        Page<User> all = dataJpaDao.findAll(pageable);
        System.out.println("当前页是"+all.getNumber());
        System.out.println("内容"+all.getContent());
        System.out.println("总页数："+all.getTotalPages());
        System.out.println("每页总数："+all.getSize());
        System.out.println("总条数："+all.getTotalElements());
    }

    @org.junit.Test
    public void findbyname(){
        Pageable pageable = new PageRequest(0,2);


        Specification spec = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
                Path id = root.get("id");
                return cb.ge(id, 2);
            }
        };
        Page all = dataJpaDao.findAll(spec, pageable);
        System.out.println(all.getContent());
    }
}
