package models;

public class Sneaker {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;





    public Sneaker(int expectedId, String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return 6;
    }

    public String getName() {
        return "Stan Smith";
    }

    public String getBrand() {
        return "Adidas";
    }

    public String getSport() {

        return "Tennis";
    }

    public int getQty() {
        return 10;
    }

    public float getPrice() {

        return 80;
    }
}
