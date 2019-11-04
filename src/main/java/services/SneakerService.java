package services;
import models.Sneaker;
import java.util.ArrayList;
import java.util.Arrays;

public class SneakerService {
    private static int nextId = 1;

    private ArrayList<Sneaker> inventory = new ArrayList<Sneaker>();

    public Sneaker create(String name, String brand, String sport, Double size, Integer quantity, Float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return inventory.get(id-1);
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        //TODO fix cast to Object[]
        return (Sneaker[]) inventory.toArray();
    }

    //delete
    public Boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        Boolean outcome = false;
        if (id <= inventory.size()) {
            inventory.remove(id);
            outcome = true;
        }
        return outcome;
    }
}