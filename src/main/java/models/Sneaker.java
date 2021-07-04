package models;

public class Sneaker {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private double size;
    private int quantity;
    private float price;


    //================ SETTERS ================//
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    //================ GETTERS ================//
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getSport() {
        return sport;
    }

    public double getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }


}


