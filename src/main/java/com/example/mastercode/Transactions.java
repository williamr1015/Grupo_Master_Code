package com.example.mastercode;

import java.time.LocalDate;

public class Transactions {
    private int id; // id de la cuenta
    private int amount; // cantidad de dinero
    private String concept; // ingreso o retiro
    private String Empresa; //empresa a la que pertenece el usuario
    private LocalDate created_at;  // Fecha de creación de la transacción
    private LocalDate updated_at;  // Fecha de actualización de la transacción

    //Constructor
    public Transactions(int id, int amount, String concept, String Empresa, LocalDate created_at, LocalDate updated_at) {
        this.id = id;
        this.amount = amount;
        this.concept = concept;
        this.Empresa = Empresa;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }


    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", amount=" + amount +
                ", concept='" + concept + '\'' +
                ", Empresa='" + Empresa + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }



}
