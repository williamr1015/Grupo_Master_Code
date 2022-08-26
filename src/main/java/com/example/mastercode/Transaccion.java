package com.example.mastercode;

import java.time.LocalDate;

public class Transaccion {

    private long id;
    private String ConceptoMovimiento;
    private double monto;
    private Empleado empleado;
    private Empresa empresa;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;

    public Transaccion(long id, String conceptoMovimiento, double monto,Empresa empresa, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.id = id;
        ConceptoMovimiento = conceptoMovimiento;
        this.monto = monto;
        //this.empleado = empleado;
        //this.empresa = empresa;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConceptoMovimiento() {
        return ConceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        ConceptoMovimiento = conceptoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        return "Transaccion{" +
                "id=" + id +
                ", ConceptoMovimiento='" + ConceptoMovimiento + '\'' +
                ", monto=" + monto +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}