package com.example.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import org.hibernate.annotations.CreationTimestamp;

import javax.xml.crypto.Data;
import java.math.BigDecimal;


@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private BigDecimal price;

    @CreationTimestamp
    private Data createdAt;

    @CreationTimestamp
    private Data  updatedAt;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Data getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Data createdAt) {
        this.createdAt = createdAt;
    }

    public Data getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Data updatedAt) {
        this.updatedAt = updatedAt;
    }
}

