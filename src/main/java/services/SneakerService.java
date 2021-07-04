package services;

import com.sun.deploy.net.MessageHeader;
import models.Sneaker;
import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;  // (1)
    private  ArrayList<Sneaker> inventory = new ArrayList<>();
    public  Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }
    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        for(Sneaker element : inventory){
            if(element.getId() == id){
                return element;
            }
        }
        return null;
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new Sneaker[0]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exists and return true.
        // Otherwise return false
        for(Sneaker element: inventory){
            if(element.getId() == id){
                inventory.remove(element);
                return true;
            }
        }
        return false;
    }
}
