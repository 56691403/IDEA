package com.ltbl.springboot_jpa.dao;

import com.ltbl.springboot_jpa.domain.Tb_permissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermiDao extends JpaRepository<Tb_permissions,Long> {
}
