package com.example.mastercode;

public class Transactions {
    private int id; // id de la cuenta
    private int amount; // cantidad de dinero
    private String concept; // ingreso o retiro
    private String enterprise; //empresa a la que pertenece el usuario
    private String created_at;  // Fecha de creación de la transacción
    private String updated_at;  // Fecha de actualización de la transacción

    //Constructor
    public Transactions(int id, int amount, String concept, String enterprise, String created_at, String updated_at) {
        this.id = id;
        this.amount = amount;
        this.concept = concept;
        this.enterprise = enterprise;
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

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
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
