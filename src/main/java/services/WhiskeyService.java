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
    public Whiskey findWhiskey(int id){
        for (int i = 0; i < joyInventory.size(); i++) {
            if (joyInventory.get(i).getId() == id)
                return joyInventory.get(i);
        }
        return null;
    }
    public Whiskey[] findAll() {
        Whiskey[] sneakersArr=new Whiskey[joyInventory.size()];
        for(int i=0; i< joyInventory.size(); i++){
            sneakersArr[i] = joyInventory.get(i);
        }

        return sneakersArr;
    }
    public boolean delete(int id) {
        for(int i=0; i<joyInventory.size();i++){
            if(joyInventory.get(i).getId()==id){
                joyInventory.remove(i);
                return true;
            }
        }
        return false;
    }
}
