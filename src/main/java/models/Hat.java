package models;

public class Hat {
    private int hatId;
    private String type; //fitted, snapback or strapback
    private String sport; //baseball, basketball, NFL
    private String team;
    private String size; //small/ medium, large
    private int quantity;
    private float price;


    //================ SETTERS ================//
    public void setHatId(int hatId) {
        this.hatId = hatId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //================ GETTERS ================//
    public int getHatId() {
        return hatId;
    }

    public String getType() {
        return type;
    }

    public String getSport() {
        return sport;
    }

    public String getTeam() {
        return team;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }


}
