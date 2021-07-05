package models;

public class Sneaker {
    private int sneakerId;
    private String name;
    private String brand;
    private String sport;
    private double size;
    private int quantity;
    private float price;

    public Sneaker() {
        this.sneakerId = Integer.MAX_VALUE;
        this.name = "";
        this.brand = "";
        this.sport = "";
        this.size = Double.MAX_VALUE;
        this.quantity = Integer.MAX_VALUE;
        this.price = Float.MAX_VALUE;
    }

    public Sneaker(int sneakerId, String name, String brand, String sport, double size, int quantity, float price) {
        this.sneakerId = sneakerId;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
}

    public static void main(String[] args) {

    }


    //================ SETTERS ================//
    public void setSneakerId(int sneakerId) {
        this.sneakerId = sneakerId;
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
    public int getSneakerId() {
        return sneakerId;
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


