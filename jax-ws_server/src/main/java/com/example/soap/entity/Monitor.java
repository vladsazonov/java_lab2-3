package com.example.soap.entity;

import java.io.Serializable;

public class Monitor implements Serializable {
    private int id;
    private String name;
    private String price;
    private String diagonal;

    public Monitor(int id, String name, String price, String diagonal) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.diagonal = diagonal;
    }

    public Monitor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", diagonal='" + diagonal + '\'' +
                '}';
    }
}
