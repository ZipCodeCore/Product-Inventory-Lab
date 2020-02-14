package Services;

import Models.Desserts;

import java.util.ArrayList;

public  class DessertsService {
    private static int nextId = 1;  // (1)

    private static ArrayList <Desserts> inventory = new ArrayList<>();  // (2)

    public static Desserts create(String name, double price, int popularity, int numServes) {

        // (2)
        Desserts createdDessert = new Desserts(nextId++, name, price, popularity, numServes);

        // (3)
        inventory.add(createdDessert);

        // (4)
        return createdDessert;
    }
    //read
    public Desserts findDessert(int id) {
        // should take an int and return an object with that id, if exists
        for(int i=0; i<inventory.size(); i++){
            if(inventory.get(i).getId()==id){
                return inventory.get(i);
            }
        }
        return null;
    }

    //read all
    public Desserts[] findAll() {
        // should return a basic array copy of the ArrayList
        Desserts[] desArr = new Desserts[inventory.size()];
        for(int i=0; i<inventory.size(); i++){
            desArr[i] = inventory.get(i);
        }
        return desArr;
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        if(findDessert(id) != null){
            inventory.remove(findDessert(id));
            return true;
        }else{
            return false;
        }
    }
}