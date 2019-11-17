package services;
import models.Sneaker;
import java.util.ArrayList;
import java.util.Arrays;

public class SneakerService {
    private static int nextId = 1;

    private ArrayList<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport, Double size, Integer quantity, Float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    public Integer size() {
        return inventory.size();
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return inventory.get(id-1);
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        Integer len = inventory.size();
        Sneaker[] sneaks = new Sneaker[len];
        for (int i = 0; i < len; i++) {
            sneaks[i] = inventory.get(i);
        }
        return sneaks;
    }

    //delete
    public Boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        Boolean outcome = false;
        if (id <= inventory.size()) {
            inventory.remove(id-1);
            outcome = true;
        }
        return outcome;
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Sneaker Inventory:\n" +
                "Id Brand Name Sport Size Qty Price");
        for (Sneaker sneaker : inventory) {
            out.append(sneaker.toString());
        }
        return out.toString();
    }

//    public void update(Integer id, String name, String brand, String sport, Double size, Integer quantity, Float price) {
//        Sneaker updated = new Sneaker(id, name, brand, sport, size, quantity, price);
//        inventory.set(id-1, updated);
//    }

    public void update(Integer id, Sneaker updated) {
        inventory.set(id-1, updated);
    }
}