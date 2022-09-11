package com.example.mastercode.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTransaction; // transaction id
    @Column(name = "amount")
    private double amount; // transaction amount
    @Column(name = "concept")
    private String concept;// transaction concept
    @ManyToOne/*(targetEntity = Enterprise.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name = "id_enterprise",referencedColumnName ="idEnterprise")
    private Enterprise enterprise; // transaction enterprice

    @ManyToOne/*(targetEntity = Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name = "id_employee",referencedColumnName ="idEmployee")
    private Employee employee;

    @Column(name = "created_at")
    private LocalDate created_at;  // transaction created date
    @Column(name = "updated_at")
    private LocalDate updated_at;  // transaction updated date

    //Constructor
    public Transaction(Long id, double amount, String concept, Enterprise enterprise, Employee employee, LocalDate created_at, LocalDate updated_at) {//
        this.idTransaction = id;
        this.amount = amount;
        this.concept = concept;
        this.enterprise = enterprise;
        this.employee = employee;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Transaction() {//Void contructor
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        return "Transaction{" +
                "id=" + idTransaction +
                ", amount=" + amount +
                ", concept='" + concept + '\'' +
                ", enterprice=" + enterprise +
                ", employer=" + employee +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
