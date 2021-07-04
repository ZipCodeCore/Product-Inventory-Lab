package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    //Generate an int ID for the each sneaker
    public static int nextID = 1;
    //Create an inventory arrayList for sneakers
    private ArrayList<Sneaker> inventory = new ArrayList<>();

    //Creates a new sneaker object and add it to the inventory.
    public Sneaker create(String name, String brand, String sport, int size, int qty, float price) {
        //2
        Sneaker createdSneaker = new Sneaker(nextID++, name, brand, sport, size, qty, price);
        //3
        inventory.add(createdSneaker);
        //4
        return createdSneaker;

    }

    //Finds a particular sneaker object in inventory using a provided id.
    public Object find(int id) {
        for(Sneaker sneaker : inventory) {
            if(sneaker.getId() == id){
                return sneaker;
            }
        }
        return null;
    }

    public Sneaker[] findAll() {
        return inventory.toArray(new Sneaker[0]);
    }

    public boolean delete(int id) {
        for(Sneaker sneaker: inventory) {
            if(sneaker.getId() == id){
                inventory.remove(sneaker);
                return true;
            }
        }
        return false;
    }

    //
}
