package com.example.base.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="color", nullable = false)
    private String color;

    @Column(name ="kilometer", nullable = false)
    private int kilometer;

    @Column(name="price", nullable = false)
    private double price;

    @Column(name="assurance", nullable = false)
    private boolean assurance;

    @Column(name="inspection", nullable = false)
    private boolean inspection;

    public Vehicle(int id, String name, String color, int kilometer, double price, boolean assurance, boolean inspection) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.kilometer = kilometer;
        this.price = price;
        this.assurance = assurance;
        this.inspection = inspection;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAssurance() {
        return assurance;
    }

    public void setAssurance(boolean assurance) {
        this.assurance = assurance;
    }

    public boolean isInspection() {
        return inspection;
    }

    public void setInspection(boolean inspection) {
        this.inspection = inspection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
