package services;

import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {
    private static int nextId = 1;
    public static void setNextId(int nextId) {
        WhiskeyService.nextId = nextId;
    }
    private ArrayList<Whiskey> joyInventory = new ArrayList<>();
    public Whiskey create( String name, String brand,float price){
        Whiskey whiskey = new Whiskey(nextId++, name, brand,price);
        joyInventory.add(whiskey);
        return whiskey;
    }
    public Whiskey findAll(){
        Whiskey
    }
}
