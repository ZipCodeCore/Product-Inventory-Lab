package models;

public class Whiskey implements Product{
    private int id;
    private String name;
    private String brand;
    private int proof;
    private Float size;
    private int qty;
    private Float price;

    public Whiskey(int id, String name, String brand, int proof, Float size, int qty, Float price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.proof = proof;
        this.size = size;
        this.qty = qty;
        this.price = price;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProof() {
        return proof;
    }

    public void setProof(int proof) {
        this.proof = proof;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
