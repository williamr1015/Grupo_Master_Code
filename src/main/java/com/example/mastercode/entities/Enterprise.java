package com.example.mastercode.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Enterprices")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEnterprise; //enterprise id
    @Column(name = "name")
    private String name;//enterprise name
    @Column(name = "nit")
    private String nit;//enterprise nit
    @Column(name = "phone")
    private String phone;//enterprise phone
    @Column(name = "address")
    private String address;//enterprise address
    @OneToMany(mappedBy = "enterprise",targetEntity = Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
/*    @JoinColumn(name = "id_employee",referencedColumnName = "idEmployee")*/
    private List<Employee> employeesList ;//enterprise employee
    @OneToMany(mappedBy = "enterprise",targetEntity = Transaction.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
/*    @JoinColumn(name = "id_transaction",referencedColumnName = "idTransaction")*/
    private List<Transaction> transactionsList; //enterprise transactions
    @Column(name = "created_at")
    private LocalDate created_at;  // transaction created date
    @Column(name = "updated_at")
    private LocalDate updated_at; // transacción updated date

    public Enterprise(Long id, String name, String nit, String phone, String address, List<Employee> employees, List<Transaction> transactionsList, LocalDate created_at, LocalDate updated_at) {
        this.idEnterprise = id;
        this.name = name;
        this.nit = nit;
        this.phone = phone;
        this.address = address;
        this.employeesList = employees;
        this.transactionsList = transactionsList;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Enterprise() {

    }

    public Long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<Transaction> transactionsList) {
        this.transactionsList = transactionsList;
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
        return "Enterprise{" +
                "idEnterprise=" + idEnterprise +
                ", name='" + name + '\'' +
                ", nit='" + nit + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", employeesList=" + employeesList +
                ", transactionsList=" + transactionsList +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}


