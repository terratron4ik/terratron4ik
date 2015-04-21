package com.springapp.mvc.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "moto")
public class Moto implements Serializable {

    private int id;
    private String brand;
    private String model;
    private String price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    @Column(name = "model")
    public String getModel() {
        return model;
    }

    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public Moto(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
