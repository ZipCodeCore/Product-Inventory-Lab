package models;

public class Sneaker {
    private static Sneaker ourInstance = new Sneaker();

    public static Sneaker getInstance() {
        return ourInstance;
    }

    private Sneaker() {
    }
}
