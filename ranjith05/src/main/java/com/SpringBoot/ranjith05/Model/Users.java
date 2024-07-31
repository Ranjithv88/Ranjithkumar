package com.SpringBoot.ranjith05.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserId;
    private String name;
    private String email;
    private String number;
    private LocalDate dataOfBirth;
    private String password;
    private LocalDate createrOn;
    private boolean status;
    private Role role;

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        this.UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreaterOn() {
        return createrOn;
    }

    public void setCreaterOn(LocalDate createrOn) {
        this.createrOn = createrOn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
