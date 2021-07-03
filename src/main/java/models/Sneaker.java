package models;

public class Sneaker {
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int quantity;
    private float price;

    public Sneaker(){
    }

    public Sneaker(String name, String brand, String sport, int size, int quantity, float price) {
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return this.sport;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
