package services;

import models.Shirt;
import models.Sneaker;

import java.util.ArrayList;

public class ShirtService {
    //ID for each shirt
    private static int nextID = 1;
    //ArrayList 'inventory' to hold all shirts
    private static ArrayList<Shirt> inventory = new ArrayList<>();

    //Method to create a new shirt and add to inventory
    public Shirt create(String shirtType, String brand, String material, int quantity, float price) {
        //instantiate a new shirt object
        Shirt newShirt = new Shirt(nextID++, shirtType, brand, material, quantity, price);
        //Add new shirt object to inventory
        inventory.add(newShirt);
        return newShirt;
    }


    public Object find(int id) {
        for (Shirt shirt: inventory) {
            if(shirt.getId() == id){
                return shirt;
            }
        }
        return null;
    }

    public Shirt[] findAll() {
        return inventory.toArray(new Shirt[0]);
    }

    public boolean delete(int id) {
        for(Shirt shirt: inventory) {
            if(shirt.getId() == id){
                inventory.remove(shirt);
                return true;
            }
        }
        return false;
    }
}
