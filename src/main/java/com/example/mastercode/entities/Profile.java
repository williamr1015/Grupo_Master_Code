package com.example.mastercode.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProfile;//profile id
    @Column(name = "name")
    private String name;//profile name
    @Column(name = "email")
    private String lastName;//profile last name
    @Column(name = "age")
    private int age;//profile age
    @OneToOne(mappedBy = "profile",targetEntity = Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Employee employee;//profile employer
    @Column(name = "phone")
    private String phone;//profile phone
    @Column(name = "created_at")
    private LocalDate created_at;//profile created date
    @Column(name = "updated_at")
    private LocalDate updated_at;//profile updated date

    public Profile(Long id, String name, String lastName, int age, Employee employee, String phone, LocalDate created_at, LocalDate updated_at) {
        this.idProfile = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.employee = employee;
        this.phone = phone;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Profile() {

    }

    public Long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Long id) {
        this.idProfile = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "Profile{" +
                "id=" + idProfile +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", employer=" + employee +
                ", phone='" + phone + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
