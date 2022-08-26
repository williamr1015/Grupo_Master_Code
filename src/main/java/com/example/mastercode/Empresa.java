package com.example.mastercode;

public class Empresa {

    private long id;
    private String nombre;
    private String nit;
    private int telefono;
    private String direccion;
    private Empleado empleado;
    private Transaccion transacciones;

    public Empresa(long id, String nombre, String nit, int telefono, String direccion,Empleado empleado, Transaccion transacciones) {//
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleado = empleado;
        this.transacciones = transacciones;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Transaccion  getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion  transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", empleado=" + empleado +
                ", transacciones=" + transacciones +
                '}';
    }
}
