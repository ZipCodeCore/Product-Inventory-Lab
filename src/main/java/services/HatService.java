package services;

import models.Hat;

import java.util.ArrayList;

public class HatService {
    private static int nextId = 1;

    private static ArrayList<Hat> inventory = new ArrayList<>();

    public static Hat create (String type, String sport, String team, String size, int quantity, float price) {
        Hat createdHat = new Hat (nextId++, type, sport, team, size, quantity, price);
        inventory.add(createdHat);
        return createdHat;
    }

    // read
    public Hat findHat(int hatId) {
        for (Hat element : inventory) {
            if(element.getHatId() == hatId) {
                return element;
            }
        }
        return null;
    }

    // read all
    public Hat[] findAll() {

        return inventory.toArray(new Hat[0]);
    }

    // delete
    public boolean delete(int hatId) {
        for (Hat element : inventory) {
            if (element.getHatId() == hatId) {
                inventory.remove(element);
                return true;
            }
        }
        return false;
    }
// add method for updating
}
