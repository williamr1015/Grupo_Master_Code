package com.example.mastercode.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmployee;//Employer id
    @Column(name = "email")
    private String email;//Employer email
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private List<Role> role;//Employer role
    @OneToOne(targetEntity = Profile.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profile",referencedColumnName = "idProfile")
    private Profile profile;//Employer profile

    @ManyToOne/*(targetEntity = Enterprise.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
    @JoinColumn(name = "id_enterprice",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;//Employer enterprice
    @OneToMany(mappedBy = "employee",targetEntity = Transaction.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    /*@JoinColumn(name = "id_transaction",referencedColumnName = "idTransaction")*/
    private List<Transaction> transaction = new ArrayList<>();

    @Column(name = "created_at")
    private LocalDate created_at;//Employer created date
    @Column(name = "updated_at")
    private LocalDate updated_at;//Employer updated date

    public Employee(Long id, String email, List<Role> role, Profile profile, Enterprise enterprise, List<Transaction> transaction, LocalDate created_at, LocalDate updated_at) {
        idEmployee = id;
        this.email = email;
        this.role = role;
        this.profile = profile;
        this.enterprise = enterprise;
        this.transaction = transaction;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Employee() {

    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
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
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", profile=" + profile +
                ", enterprice=" + enterprise +
                ", transaction=" + transaction +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
        