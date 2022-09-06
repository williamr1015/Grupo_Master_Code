package com.example.mastercode.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRole;//roll id
    @Column(name = "role")
    private String role;//rol

    public Role(Long idRole, String role) {
        this.idRole = idRole;
        this.role = role;
    }

    public Role() {

    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" + "idRole=" + idRole + ", role='" + role + '\'' + '}';
    }
}
