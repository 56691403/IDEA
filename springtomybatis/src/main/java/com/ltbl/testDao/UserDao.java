package com.ltbl.testDao;

import com.ltbl.domain.Tb_User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao  {
    @Select("select * from tb_user")
    List<Tb_User> findAll();
}
