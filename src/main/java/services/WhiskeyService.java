package services;

import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {
    private static int nextId = 1;
    private ArrayList<Whiskey> inventory = new ArrayList<>();

    public Whiskey create(String name, String brand, Integer quantity, Float price) {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, quantity, price);
        inventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public Whiskey findWhiskey(int id) {
        return inventory.get(id-1);
    }

    public Whiskey[] findAll() {
        Integer len = inventory.size();
        Whiskey[] whisks = new Whiskey[len];
        for (int i = 0; i < len; i++) {
            whisks[i] = inventory.get(i);
        }
        return whisks;
    }

    public Boolean delete(int id) {
        Boolean outcome = false;
        if (id <= inventory.size()) {
            inventory.remove(id);
            outcome = true;
        }
        return outcome;
    }
}
