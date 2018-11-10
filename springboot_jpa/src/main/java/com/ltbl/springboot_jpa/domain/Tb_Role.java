package com.ltbl.springboot_jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Tb_Role implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rid;
    @Column
    private String rname;

    @ManyToMany(targetEntity = Tb_permissions.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "sys_Role_Permissions",
                joinColumns = {@JoinColumn(name = "roleId",referencedColumnName = "rid")},
                inverseJoinColumns = {@JoinColumn(name = "permissionsId",referencedColumnName = "pid")})
    private Set<Tb_permissions> tb_permissions = new HashSet<>();

    public Tb_Role(String rname) {
        this.rname = rname;
    }

    public Tb_Role() {
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<Tb_permissions> getTb_permissions() {
        return tb_permissions;
    }

    public void setTb_permissions(Set<Tb_permissions> tb_permissions) {
        this.tb_permissions = tb_permissions;
    }

    @Override
    public String toString() {
        return "Tb_Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }
}
