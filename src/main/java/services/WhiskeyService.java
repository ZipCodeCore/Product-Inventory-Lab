package services;

import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {

    private static int nextId = 1;
    private ArrayList<Whiskey> inventory = new ArrayList<>();


    public Whiskey create(String brand, int quantity, float price) {

        // (2)
        Whiskey createdWhiskey = new Whiskey(brand, nextId++ ,quantity, price);

        // (3)
        this.inventory.add(createdWhiskey);

        // (4)
        return createdWhiskey;
    }
}
