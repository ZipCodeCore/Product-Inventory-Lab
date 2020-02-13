package Models;

public class Desserts {
    private String name;
    private double price;
    private boolean servedCold;
    private boolean currentlyOnMenu;

    public Desserts(String name, double price, boolean servedCold, boolean currentlyOnMenu){
        this.name = name;
        this.price = price;
        this.servedCold = servedCold;
        this.currentlyOnMenu = currentlyOnMenu;

    }

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

    public void setServedCold(boolean servedCold) {
        this.servedCold = servedCold;
    }
    public boolean getServedCold() {
        return servedCold;
    }

    public void setcurrentlyOnMenu(boolean currentlyOnMenu) {
        this.currentlyOnMenu = currentlyOnMenu;
    }
    public boolean getcurrentlyOnMenu() {
        return currentlyOnMenu;
    }
}
