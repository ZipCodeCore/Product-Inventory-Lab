package Models;

public class Desserts {
    private String name;
    private boolean servedCold;
    private double price;
    private boolean currentlyOnMenu;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
