package com.test2.demo.testDao;

import com.test2.demo.domain.Tb_User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao extends tk.mybatis.mapper.common.Mapper {
    @Select("select * from user")
    public List<Tb_User> findAll();
}
