package models;


public class Coffee {
    private Integer unitId;
    private Integer amountInStock;
    private String brand;
    private String flavor;
    private Double price;
    private Double weight;

    public Coffee(Integer expectedUnitId, Integer expectedAmountInStock, String expectedBrand,
                  String expectedFlavor, Double expectedPrice, Double expectedWeight) {
        this.unitId = expectedUnitId;
        this.amountInStock = expectedAmountInStock;
        this.brand = expectedBrand;
        this.flavor = expectedFlavor;
        this.price = expectedPrice;
        this.weight = expectedWeight;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(Integer amountInStock) {
        this.amountInStock = amountInStock;
    }

    public java.lang.String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public java.lang.String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String printingInventory = "Unit ID: " + getUnitId();
        printingInventory += "Amount in Stock: " + getAmountInStock();
        printingInventory += "Brand Name: " + getBrand();
        printingInventory += "Flavor Type: " + getFlavor();
        printingInventory += "Retail Price: " + getPrice();
        printingInventory += "Retail Weight: " + getWeight();

        return printingInventory;
    }
}
