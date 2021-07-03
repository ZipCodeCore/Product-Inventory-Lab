package models;

public class Sneaker {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private Float size;
    private int qty;
    private Float price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
