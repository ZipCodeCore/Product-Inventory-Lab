package models;

public class Hat {
    private int hatId;
    private String type; //fitted, snapback or strapback
    private String sport; //baseball, basketball, NFL
    private String team;
    private String size; //small/ medium, large
    private int quantity;
    private float price;

    public Hat(){
        this.hatId = Integer.MAX_VALUE;
        this.type = "";
        this.sport = "";
        this.team = "";
        this.size = "";
        this.quantity = Integer.MAX_VALUE;
        this.price = Float.MAX_VALUE;
    }

    public Hat (int hatId, String type, String sport, String team, String size, int quantity, float price) {
        this.hatId = hatId;
        this.type = type;
        this.sport = sport;
        this.team = team;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

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
