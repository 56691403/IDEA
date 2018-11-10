package com.ltbl.dao;

import com.ltbl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataJpaDao extends JpaRepository<User,Long>,JpaSpecificationExecutor{

    public List<User> findAllByUsernameEquals(String name);
}
