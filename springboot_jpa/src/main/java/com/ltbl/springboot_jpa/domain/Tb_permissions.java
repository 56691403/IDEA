package com.ltbl.springboot_jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "permissions")
public class Tb_permissions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long pid;
    @Column
    private String name;

    @ManyToMany(targetEntity = Tb_Role.class,mappedBy = "tb_permissions",fetch = FetchType.EAGER)
    private Set<Tb_Role> roles;


    public Tb_permissions() {
    }

    public Tb_permissions(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tb_Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Tb_Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Tb_permissions{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}
