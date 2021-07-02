package services;

import models.Coffee;

import java.util.ArrayList;

public class CoffeeService {

    private static Integer nextUnitId = 1;
    private static ArrayList<Coffee> inventory = new ArrayList<>();

    public static Coffee create(Integer unitId, Integer amountInStock, String brand, String flavor, Double price, Double weight) {

        Coffee createdCoffee = new Coffee(unitId++, amountInStock, brand, flavor, price, weight);

        inventory.add(createdCoffee);

        return createdCoffee;
    }

    public Coffee findCoffee(Integer unitId) {
        return inventory.get(unitId);
    }
    public Coffee[] findAll() {
        return inventory.toArray(new Coffee[0]);
    }
    public boolean delete(Integer unitId) {
        if (inventory.contains(unitId)) {
            inventory.remove(unitId);
        }
        return false;
    }
}
