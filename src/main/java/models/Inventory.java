package models;

import services.CoffeeService;
import services.MugsService;

import java.util.Scanner;

public class Inventory {
    private CoffeeService coffeeService = new CoffeeService();
    private MugsService mugsService = new MugsService();

    public CoffeeService getCoffeeService() {
        return this.coffeeService;
    }

    public MugsService getMugsService() {
        return this.mugsService;
    }

    public Integer coffeeInStock() {
        Coffee[] allCoffee = this.coffeeService.findAll();
        Integer count = 0;

        for(Coffee index: allCoffee) {
            count += index.getAmountInStock();
        }
        return count;
    }

    public Integer specificOrder() {
      //  return this.coffeeService.findCoffee();
        return null;
    }

}
