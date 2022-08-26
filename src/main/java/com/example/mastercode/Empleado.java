package com.example.mastercode;

import java.time.LocalDate;

public class Empleado {
    private long id;
    private String correoElectronico;
    private Perfil perfil;
    private Rol rol;
    private Empresa empresa;
    private Transaccion transaccion;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;

    public Empleado(long id, String correoElectronico, Perfil perfil, Rol rol, Empresa empresa, Transaccion transaccion, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transaccion = transaccion;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", perfil=" + perfil +
                ", rol=" + rol +
                ", empresa=" + empresa +
                ", transaccion=" + transaccion +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
        