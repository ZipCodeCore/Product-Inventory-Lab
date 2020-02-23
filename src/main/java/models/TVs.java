package models;

public class TVs {

    private  String name;
    private int quantity;
    private Double price;

    //a.need this for testing individual and combined
    public TVs () {
        this.name = "Samsung";
        this.quantity = 500;
        this.price = 29.99;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public int getQuantity() {return quantity;}

    public void setPrice(Double price) {this.price = price;}

    public Double getPrice() {return price;}

    //d. need this for constructor
    public TVs(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


}



