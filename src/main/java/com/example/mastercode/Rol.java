package com.example.mastercode;

public class Rol {
    private String rol1;
    private int idRol;

    public Rol(String rol1, int idRol) {
        this.rol1 = rol1;
        this.idRol = idRol;
    }

    public String getRol1() {
        return rol1;
    }

    public void setRol1(String rol1) {
        this.rol1 = rol1;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "rol1='" + rol1 + '\'' +
                ", idRol=" + idRol +
                '}';
    }
}
