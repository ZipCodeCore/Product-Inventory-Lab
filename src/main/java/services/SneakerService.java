package services;

import models.Sneaker;
import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;

    private static ArrayList<Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String name, String brand, String sport, double size, int quantity, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    // read
    public Sneaker findSneaker(int sneakerId) {
        for (Sneaker element : inventory) {
            if (element.getSneakerId() == sneakerId) {
                return element;
            }
        }
        return null;
    }

    // read all
    public Sneaker[] findAll() {

        return inventory.toArray(new Sneaker[0]);
    }

    // delete
    public boolean delete(int sneakerId) {
        for (Sneaker element : inventory) {
            if (element.getSneakerId() == sneakerId) {
                inventory.remove(element);
                return true;
            }
        }
        return false;
    }

}
