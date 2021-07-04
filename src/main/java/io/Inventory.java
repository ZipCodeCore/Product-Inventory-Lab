package io;

import models.Shirt;
import models.Sneaker;
import services.ShirtService;
import services.SneakerService;

import java.util.ArrayList;
import java.util.Locale;

public class Inventory {
    static SneakerService sneakerService = new SneakerService();
    static ShirtService shirtService = new ShirtService();

    static void putSomeItemsInInventory() {
        sneakerService.create("NitroBalance", "Nike", "Running", 8, 15, 60.00f);
        sneakerService.create("RainbowFeet", "Adidas", "Soccer", 7, 20, 55.00f);
        sneakerService.create("BubbleGum", "Puma", "Dance", 6, 10, 70.00f);
        shirtService.create("Vneck", "Jcrew", "Cotton", 25, 20.00f);
        shirtService.create("Button-Down", "FruitDeLoom", "Cotton", 50, 10.00f);
        shirtService.create("Sweater", "Nautica", "Wool", 15, 45.00f);
    }


    static void viewInventory(){
        ArrayList<String> wholeInventory = new ArrayList<>();
        for (Shirt shirt: shirtService.findAll()) {
            wholeInventory.add(shirt.getShirtType());
        }
        for (Sneaker sneaker: sneakerService.findAll()) {
            wholeInventory.add(sneaker.getName());
        }
        String readOut = wholeInventory.toString();
        Console.println("The current inventory has: " + readOut.substring(1, readOut.length()-1 ));
    }

    static void viewProduct() {
        String productType = Console.getStringInput("Shirts or Sneakers?");
        switch (productType.toLowerCase(Locale.ROOT)) {
            case "shirts":
                Integer viewThisShirt = Console.getIntegerInput("Enter item ID to view");
                shirtService.find(viewThisShirt);
                break;
            case "sneaker":
                Integer viewThisSneaker = Console.getIntegerInput("Enter item ID to view");
                sneakerService.find(viewThisSneaker);
                break;
        }
    }

    static void removeProduct() {
        String productType = Console.getStringInput("Shirts or Sneakers?");
        switch (productType.toLowerCase(Locale.ROOT)){
            case "shirts":
                Integer deleteThisShirt = Console.getIntegerInput("Enter item ID to delete");
                shirtService.delete(deleteThisShirt);
                break;
            case "sneakers":
                Integer deleteThisSneaker = Console.getIntegerInput("Enter item ID to delete");
                sneakerService.delete(deleteThisSneaker);
                break;
        }
    }

    public static void makeNewProduct(){
        String productType = Console.getStringInput("Choose shirt or sneaker").toLowerCase(Locale.ROOT);
        switch(productType) {
            case "shirt":
                //Male new shirt
                String shirtType = Console.getStringInput("Enter shirt type:");
                String shirtBrand = Console.getStringInput("Enter shirt brand:");
                String shirtMaterial = Console.getStringInput("Enter shirt material:");
                int shirtQuantity = Console.getIntegerInput("Enter quantity:");;
                float shirtPrice = Console.getFloatInput("Enter price");
                shirtService.create(shirtType, shirtBrand, shirtMaterial, shirtQuantity, shirtPrice);

                break;
            case "sneaker":
                //Make new sneaker
                String sneakerName = Console.getStringInput("Enter sneaker name:");
                String sneakerBrand = Console.getStringInput("Enter sneaker brand:");
                String sneakerSport = Console.getStringInput("Enter sneaker sport:");
                int sneakerSize = Console.getIntegerInput("Enter sneaker size:");
                int sneakerQty = Console.getIntegerInput("Enter quantity:");
                float sneakerPrice = Console.getFloatInput("Enter price:");
                sneakerService.create(sneakerName, sneakerBrand, sneakerSport, sneakerSize, sneakerQty, sneakerPrice);
                break;
        }
    }

}
