package models;

public class Sneaker {

    private int id;
    private String name;
    private String brand;
    private String sport;
    private float size;
    private int qty;
    private float price;

    public Sneaker(int id, String name, String brand, String sport, float size, int quantity, float price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.qty = quantity;
        this.price = price;
    }

    public void setName(String name) { this.name = name;}

    public String getName() { return this.name; }

    public String getBrand() { return this.brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public void setSport(String sport) { this.sport = sport; }

    public String getSport() { return this.sport; }

    public float getSize() { return this.size; }

    public void setSize(float size) { this.size = size; }

    public int getQty() { return this.qty; }

    public void setQty(int qty) { this.qty = qty; }

    public float getPrice() { return this.price; }

    public void setPrice(float price) { this.price = price; }

    public float getId() { return this.id; }
}
