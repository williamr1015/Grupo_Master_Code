package com.example.mastercode;

public class EmpleadoMC {

        private int Id;
        private String nombre;
        private String apellido;
        private String email;
        private String role;
        private String profile;
        private String enterprise;
        private int edad;
        private String created_at;
        private String updated_at;

    public EmpleadoMC(int id, String nombre, String apellido, String email, String role, String profile, String enterprise, int edad, String created_at, String updated_at) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.role = role;
        this.profile = profile;
        this.enterprise = enterprise;
        this.edad = edad;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

}
        