
package io;
import models.Inventory;
import models.Product;
import models.Whiskey;
import models.Sneaker;
import services.SneakerService;
import services.WhiskeyService;
import sun.nio.ch.sctp.SctpNet;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Console<decimalFormatter> {
    private static Inventory inventory = new Inventory();
    private static DecimalFormat decimalFormatter = new DecimalFormat("0.00");

    public static void initializeSampleInventory(){
        SneakerService sneakerService = inventory.getSneakerService();
        WhiskeyService whiskeyService = inventory.getWhiskeyService();

        sneakerService.create("Step Daddy", "NYRP", "Casual", 10.5f, 39, 39.99f);
        sneakerService.create("Step Momma", "NYRP", "Casual", 8.5f, 28, 45.99f);
        sneakerService.create("Reebles", "Yamaha", "Standing Still", 10.5f, 15, 34.99f);

        whiskeyService.create("Jawn Juice", "NoDrive", 45, 50.0f, 125, 45.50f);
        whiskeyService.create("Ewwater", "Bad Taste", 45, 45.7f, 99, 55.50f);
        whiskeyService.create("Foolaid", "Krunk Bvg Co", 60, 80.00f, 22, 89.95f);
    }

    public static void print(String input){
        System.out.println(input);
    }
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");
    }

    public static void topMenu(){
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("Choose a menu option (select using the option's menu number)");
        print("Enter any other number/letter to exit program");
        print("1. Inventory Report");
        print("2. Edit Inventory");
        print("3. Delete Product");
        input = scanner.nextInt();

        switch(input){
            case 1: // Select Inventory Report
                inventoryReportMenu();
                break;

            case 2:
                editInventoryMenu();
                break;
            case 3:
                deleteInventoryMenu();
            default:
                print("Exiting program");
        }

    }

    public static void inventoryReportMenu(){
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("Select report to generate");
        print("1. Sneaker");
        print("2. Whiskey");
        print("3. All Products");
        print("4. Go Back to Top Menu");

        input = scanner.nextInt();
        if(input >= 4){
            topMenu();
        } else {
            inventoryReportOptions(input);
        }
    }

    public static void printInventoryMenu(){
        print("Select a Category to edit");
        print("1. Sneakers");
        print("2. Whiskey");
        print("3. Return to previous menu");
    }

    public static void editInventoryMenu(){
        Scanner scanner = new Scanner(System.in);
        Integer input;
        printInventoryMenu();
        input = scanner.nextInt();
        switch (input){
            case 1:
                selectSneakerMenu();
                break;
            case 2:
                selectWhiskeyMenu();
                break;
            case 3:
            default:
                topMenu();
        }
    }

    public static void inventoryReportOptions(Integer option){
        switch(option){
            case 1:
                printList(inventory.getSneakerService().findAll());
                break;
            case 2:
                printList(inventory.getWhiskeyService().findAll());
                break;
            case 3:
                printList(inventory.getAllProductsArrayList());
        }
        inventoryReportMenu();
    }

    public static void selectSneakerMenu(){
        print("Select product to edit");
        Sneaker[] sneakerList = inventory.getSneakerService().findAll();
        printList(sneakerList);
        Scanner scanner = new Scanner(System.in);
        Integer menuSelection = scanner.nextInt();
        editSneakerMenu(sneakerList[menuSelection - 1]);
    }

    public static void selectWhiskeyMenu(){
        print("Select product to edit");
        Whiskey[] whiskeyList = inventory.getWhiskeyService().findAll();
        printList(whiskeyList);
        Scanner scanner = new Scanner(System.in);
        Integer menuSelection = scanner.nextInt();
        editWhiskeyMenu(whiskeyList[menuSelection - 1]);
    }

    public static void printCommonPropertyOptions(){
        print("Select menu option number to edit property");
        print("1: Name");
        print("2: Brand");
        print("3: Size");
        print("4: Price");
        print("5: Quantity");
    }

    public static void editSneakerMenu(Sneaker sneaker){
        Scanner scanner = new Scanner(System.in);
        Integer menuSelectionNumber;
        Integer integerInput;
        String stringInput;
        Float floatInput;
        print("Selected: " + sneaker.toString());
        printCommonPropertyOptions();
        print("6: Sport");
        print("7: Previous menu");
        menuSelectionNumber = scanner.nextInt();
        switch (menuSelectionNumber){
            case 1: //Name
                print("Enter new name for product");
                scanner.nextLine();
                stringInput = scanner.nextLine();
                sneaker.setName(stringInput);
                editSneakerMenu(sneaker);
                break;
            case 2: //Brand
                print ("Enter new brand name for product");
                scanner.nextLine();
                stringInput = scanner.nextLine();
                sneaker.setBrand(stringInput);
                editSneakerMenu(sneaker);
                break;
            case 3: //Size
                print ("Enter new size for product");
                scanner.nextLine();
                floatInput = scanner.nextFloat();
                sneaker.setSize(floatInput);
                editSneakerMenu(sneaker);
            case 4: //Price
                print ("Enter new price for product");
                scanner.nextLine();
                floatInput = scanner.nextFloat();
                sneaker.setPrice(floatInput);
                editSneakerMenu(sneaker);
            case 5: //Quantity
                print ("Enter new quantity for product");
                scanner.nextLine();
                integerInput = scanner.nextInt();
                sneaker.setQty(integerInput);
                editSneakerMenu(sneaker);
            case 6: //
                print ("Enter new Sport for product");
                scanner.nextLine();
                stringInput = scanner.nextLine();
                sneaker.setSport(stringInput);
                editSneakerMenu(sneaker);
            default: //Input 7 or any number not listed above
                editInventoryMenu();
        }
    }

    public static void editWhiskeyMenu(Whiskey whiskey){
        Scanner scanner = new Scanner(System.in);
        Integer menuSelectionNumber;
        Integer integerInput;
        String stringInput;
        Float floatInput;
        print("Selected: " + whiskey.toString());
        printCommonPropertyOptions();
        print("6: Proof");
        print("7: Previous menu");
        menuSelectionNumber = scanner.nextInt();
        switch (menuSelectionNumber){
            case 1: //Name
                print("Enter new name for product");
                scanner.nextLine();
                stringInput = scanner.nextLine();
                whiskey.setName(stringInput);
                editWhiskeyMenu(whiskey);
                break;
            case 2: //Brand
                print ("Enter new brand name for product");
                scanner.nextLine();
                stringInput = scanner.nextLine();
                whiskey.setBrand(stringInput);
                editWhiskeyMenu(whiskey);
                break;
            case 3: //Size
                print ("Enter new size for product");
                scanner.nextLine();
                floatInput = scanner.nextFloat();
                whiskey.setSize(floatInput);
                editWhiskeyMenu(whiskey);
            case 4: //Price
                print ("Enter new price for product");
                scanner.nextLine();
                floatInput = scanner.nextFloat();
                whiskey.setPrice(floatInput);
                editWhiskeyMenu(whiskey);
            case 5: //Quantity
                print ("Enter new quantity for product");
                scanner.nextLine();
                integerInput = scanner.nextInt();
                whiskey.setQty(integerInput);
                editWhiskeyMenu(whiskey);
            case 6: //
                print ("Enter new Proof for product");
                scanner.nextLine();
                integerInput = scanner.nextInt();
                whiskey.setProof(integerInput);
                editWhiskeyMenu(whiskey);
            default: //Input 7 or any number not listed above
                editInventoryMenu();
        }
    }

    public static void deleteInventoryMenu(){
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("Select Category to delete from");
        print("1: Sneakers");
        print("2: Whiskey");
        print("3: Return to previous menu");
        input = scanner.nextInt();
        Product[] productList;
        switch(input){
            case 1:
                productList = inventory.getSneakerService().findAll();
                deleteProductMenu(productList);
            case 2:
                productList = inventory.getWhiskeyService().findAll();
                deleteProductMenu(productList);
            default: //Input 3 or any number not listed above
                topMenu();
        }

    }

    public static void deleteProductMenu(Product[] productList){
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("Select product to delete");
        print("AT LEAST ONE PRODUCT OF EACH CATEGORY MUST REMAIN. THIS IS A BUSINESS, PEOPLE");
        print("0: Return to previous menu");

        if(productList.length < 2)
            topMenu();

        printList(productList);
        input = scanner.nextInt();
        if(input == 0){
            deleteInventoryMenu();
        } else {
            --input;
            input = input < productList.length ? input : productList.length -1;
            if(productList[input] instanceof Sneaker){
                inventory.getSneakerService().delete(productList[input].getId());
            } else {
                inventory.getWhiskeyService().delete(productList[input].getId());
            }
            deleteInventoryMenu();
        }

    }

    public static void printList(Product[] list){
        ArrayList<Product> aList = new ArrayList<>(Arrays.asList(list));
        String productType = "";
        Integer listNumber = 0;
        for(Product element: aList){
            String price = decimalFormatter.format(element.getTotalPrice());
            productType = element instanceof Whiskey ? "Whiskey: " : "Sneaker: ";
            print(++listNumber + ": " + productType + element.getName() + "   qty:" + element.getQty() + "   total $" + price);
        }
    }

}
