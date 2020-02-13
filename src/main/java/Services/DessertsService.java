package Services;

import Models.Desserts;
import Models.TradingCards;

import java.util.ArrayList;

public class DessertsService {
    private static int nextId = 1;  // (1)

    private arrList <Desserts> inventory = new ArrayList<Desserts>();  // (2)

    public Desserts create(int id, String name, double price, boolean servedCold, boolean currentlyOnMenu) {

        // (2)
        Desserts createdDessert = new Desserts(nextId++, name, price, servedCold, currentlyOnMenu);

        // (3)
        inventory.add(createdDessert);

        // (4)
        return createdDessert;
    }
    //read
    public Desserts findTradingCard(int id) {
        // should take an int and return an object with that id, if exists
    }

    //read all
    public Desserts[] findAll() {
        // should return a basic array copy of the ArrayList
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
    }
}
