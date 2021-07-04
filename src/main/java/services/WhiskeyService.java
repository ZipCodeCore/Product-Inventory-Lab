package services;

import models.Sneaker;
import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {
    private static int nextId = 1;
    private static ArrayList<Whiskey> inventory = new ArrayList<>();
    public static Whiskey create(String name, String brand, int proof, float size, int quantity, float price) {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, proof, size, quantity, price);
        inventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public Whiskey findWhiskey(int id) {
        for(Whiskey element : inventory){
            if(element.getId() == id){
                return element;
            }
        }
        return null;
    }

    public Whiskey[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new Whiskey[0]);
    }

    public boolean delete(int id) {
        for(Whiskey element: inventory){
            if(element.getId() == id){
                inventory.remove(element);
                return true;
            }
        }
        return false;
    }
}
