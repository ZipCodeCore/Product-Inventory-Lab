package models;

public class Shirt {
    private String shirtType;
    private String brand;
    private String material;
    private int quantity;
    private double price;

    public Shirt(){
    }

    public void setShirtType(String type) {
        this.shirtType = type;
    }

    public String getShirtType() {
        return this.shirtType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
