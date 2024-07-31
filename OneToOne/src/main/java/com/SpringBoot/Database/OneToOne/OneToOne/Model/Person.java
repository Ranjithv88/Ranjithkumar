package com.SpringBoot.Database.OneToOne.OneToOne.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Office")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "department")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

