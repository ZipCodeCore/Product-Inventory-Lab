package models;

import services.CoffeeService;
import services.MugsService;

import java.io.Writer;
import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

import static services.CoffeeService.inventory;
import static services.CoffeeService.nextUnitId;

public class Console {
    private static Inventory inventory = new Inventory();


    public static void printWelcome() {
        System.out.println("Welcome to Mugs N' Cof");
    }

    public static void initializeSampleInventory() {
        CoffeeService coffeeService = inventory.getCoffeeService();
        MugsService mugsService = inventory.getMugsService();

        coffeeService.create(100, 4000, "Folgers",
                "Dark Roast", 9.99, 16.0);
        coffeeService.create(69, 3500, "Maxwell",
                "Light Roast", 14.99, 18.0);
        coffeeService.create(4951, 30, "Starbucks",
                "Medium Roast", 12.99, 24.00);
    }

    public static void entryMenu () {
        Scanner scanner = new Scanner(System.in);
        print("1. Inventory");
        print("2. Update");
        print("3. Delete");
        print("4. Exit");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 :
                  inventoryMenu();
                break;
            case 2 :
                  updateMenu();
                break;
            case 3 :
                  deleteMenu();
                break;
            case 4 :
            default:
                print("See ya soon, buckaroon");
        }

    }

    public static void inventoryMenu() {
        Scanner scanner = new Scanner(System.in);
        print("What inventory would you like to view");
        print("1. Coffee");
        print("2. Mugs");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 :
                coffeeInventory();
                entryMenu();
                break;
            case 2 :
                // mugsInventory();
                break;
            default:
        }

    }

    public static void coffeeInventory () {
        Integer option = 1;

        Coffee[] coffeeInventory = inventory.getCoffeeService().findAll();
        for (Coffee coffee : coffeeInventory) {
           print(option++ + coffee.toString());
        }
    }

    public static void updateMenu () {
        coffeeInventory();
        Scanner scanner = new Scanner(System.in);
        Coffee[] coffeeInventory = inventory.getCoffeeService().findAll();
        int userInput = scanner.nextInt();
        Coffee coffee = coffeeInventory[userInput - 1];
        print("Enter new number for amount");
        scanner.nextLine();
        userInput = scanner.nextInt();
        coffee.setAmountInStock(userInput);
        entryMenu();
    }

    public static void  deleteMenu () {
        coffeeInventory();
        print("Enter numbered item for deletion");
        Scanner scanner = new Scanner(System.in);
        Coffee[] coffeeInventory = inventory.getCoffeeService().findAll();
        int userInput = scanner.nextInt();
        Coffee coffee = coffeeInventory[userInput - 1];
        inventory.getCoffeeService().delete(coffee.getUnitId());
        entryMenu();
    }


    public static void print(String input) {
        System.out.println(input);
    }

}
