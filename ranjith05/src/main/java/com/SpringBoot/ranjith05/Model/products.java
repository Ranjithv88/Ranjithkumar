package com.SpringBoot.ranjith05.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ProductsId;
    private String name;
    private String Description;
    private double price;
    private long Stock;
    private LocalDate createrOn;
    private String image;
    private long CategoryId;

    public long getProductsId() {
        return ProductsId;
    }

    public void setProductsId(long productsId) {
        ProductsId = productsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getStock() {
        return Stock;
    }

    public void setStock(long stock) {
        Stock = stock;
    }

    public LocalDate getCreaterOn() {
        return createrOn;
    }

    public void setCreaterOn(LocalDate createrOn) {
        this.createrOn = createrOn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }
}

