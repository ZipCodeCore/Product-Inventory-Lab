package Models;

public class Clothing {
    private int id;
    private String name;
    private String brand;
    private int size;
    private int quantity;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Clothing()
    {}

    public Clothing(int id,String name,String brand,int Size,int quantity,float price){
        this.id=id;
        this.name=name;
        this.brand=brand;
        this.size=size;
        this.quantity=quantity;
        this.price=price;
    }


public String getName(){
    return name;
    }

}

