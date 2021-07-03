package models;

public class Whiskey {
    int id;
    String name;
    String brand;
    float price;

    public Whiskey(int id, String name, String brand,float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price=price;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + "}";
    }
}
