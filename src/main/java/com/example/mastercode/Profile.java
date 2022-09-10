package com.example.mastercode;

import java.time.LocalDate;

import com.example.mastercode.entities.EmpleadoMC;

public class Profile {
    private int id;
    private EmpleadoMC empleado;
    private String telefono;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;
    
    public Profile(int id, EmpleadoMC empleado, String telefono, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.id = id;
        this.empleado = empleado;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public EmpleadoMC getEmpleado() {
        return empleado;
    }
    public void setEmpleado(EmpleadoMC empleado) {
        this.empleado = empleado;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        return "Profile [id=" + id + ", empleado=" + empleado + ", telefono=" + telefono + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + "]";
    }
    
}
