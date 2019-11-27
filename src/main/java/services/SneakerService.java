package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;
    private ArrayList<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {
        Sneaker sneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(sneaker);
        return sneaker;
    }

    public Sneaker findSneaker(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId() == id)
                return inventory.get(i);
        }
        return null;

    }
    public Sneaker[] findAll() {
        Sneaker[] sneakersArr=new Sneaker[inventory.size()];
        for(int i=0; i< inventory.size(); i++){
            sneakersArr[i] = inventory.get(i);
        }

        return sneakersArr;
    }
    public boolean delete(int id) {
        for(int i=0; i<inventory.size();i++){
            if(inventory.get(i).getId()==id){
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }

}