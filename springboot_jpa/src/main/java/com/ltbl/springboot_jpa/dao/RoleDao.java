package com.ltbl.springboot_jpa.dao;

import com.ltbl.springboot_jpa.domain.Tb_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDao extends JpaRepository<Tb_Role,Long>, JpaSpecificationExecutor<Tb_Role> {
}
