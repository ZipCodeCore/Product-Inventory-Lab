package Models;

public class Desserts {



    private int id;
    private String name;
    private double price;
    private int popularity;
    private int numServes;

    public Desserts(){

    }

    public Desserts(int id, String name, double price, int popularity, int numServes){
        this.id = id;
        this.name = name;
        this.price = price;
        this.popularity = popularity;
        this.numServes = numServes;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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

    public void setpopularity(int popularity) {
        this.popularity = popularity;
    }
    public int getpopularity() {
        return popularity;
    }

    public void setnumServes(int numServes) {
        this.numServes = numServes;
    }
    public int getnumServes() {
        return numServes;
    }
}
