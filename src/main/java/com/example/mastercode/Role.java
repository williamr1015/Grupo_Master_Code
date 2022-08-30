package com.example.mastercode;

public class Role {
    private String role1;
    private int idRole;

    public Role(String role1, int idRole) {
        this.role1 = role1;
        this.idRole = idRole;
    }

    public String getRole1() {
        return role1;
    }
    public void setRole1(String role1) {
        this.role1 = role1;
    }
    public int getIdRole() {
        return idRole;
    }
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    @Override
    public String toString() {
        return "Role [role1=" + role1 + ", idRole=" + idRole + "]";
    }
}
