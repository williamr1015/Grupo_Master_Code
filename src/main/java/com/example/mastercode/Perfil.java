package com.example.mastercode;
import java.time.LocalDate;

public class Perfil {
    private long id;
    private Empleado empleado;
    private String telefono;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;

    public Perfil(long id,Empleado empleado, String telefono, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.id = id;
        this.empleado = empleado;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
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
        return "Perfil{" +
                "id=" + id +
                ", empleado=" + empleado +
                ", telefono='" + telefono + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
