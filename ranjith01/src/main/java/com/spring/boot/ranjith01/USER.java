package com.spring.boot.ranjith01;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name = "ranjithlogin")
public class USER {
    @Id
   @Column(name = "id")
    private String id;

   @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
