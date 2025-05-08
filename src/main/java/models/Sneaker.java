package models;

import java.util.ArrayList;
import java.util.List;

public class Sneaker {
    public int getQuantity;
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    public Sneaker(int id, String name, String brand, String sport, int qty, int size, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.qty = qty;
        this.size = size;
        this.price = price;

    }

    public Sneaker(int id, String name, String brand, String sport, int qty, float price) {
    }


    public  String getName() {
        return this.name;
    }
    public void  setName(String name ) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }
}

