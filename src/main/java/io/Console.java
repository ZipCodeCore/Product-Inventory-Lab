package io;

import services.ShirtService;
import services.SneakerService;

import java.util.Locale;
import java.util.Scanner;

public class Console {
    public SneakerService sneakerService = new SneakerService();
    public ShirtService shirtService = new ShirtService();

    public static void printWelcome(){
        System.out.println("" +
                "**************************************************" + "\n" +
                "***           Welcome and Bienvenue            ***" + "\n" +
                "***                    to                      ***" + "\n" +
                "***        Nathan's Inventory Manager          ***" + "\n" +
                "**************************************************");
    }
    //Prints out the options for app
    public static void printOptions() {
        System.out.println("" +
                "*****************************************" + "\n" +
                "***    1. Create new product          ***" + "\n" +
                "***    2. View current inventory      ***" + "\n" +
                "***    3. Update product              ***" + "\n" +
                "***    4. View product reports        ***" + "\n" +
                "***    5. Exit                        ***" + "\n" +
                "*****************************************");
    }

    public static void print(String output, Object...args){
        System.out.printf(output, args);
    }

    public static void println(String output, Object...args){
        print(output + "\n" + args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    public static Float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Float userInput = Float.parseFloat((scanner.nextLine()));
        return userInput;
    }

    public static void options() {
        boolean exitNow = false;
        while(exitNow){
            Integer option = Console.getIntegerInput("Type number to choose option");
            switch (option) {
                case 1:
                    makeNewProduct();
                    break;
                case 2:
                    //Do something
                    break;
                case 3:
                    //Do something
                    break;
                case 4:
                    //Do something
                    break;
                case 5:
                    exitNow = true;
                    break;
            }
        }


    }

    public static void makeNewProduct(){
        String productType = Console.getStringInput("Choose shirt or sneaker").toLowerCase(Locale.ROOT);
        switch(productType) {
            case "shirt":
                //Male new shirt

                break;
            case "sneaker":
                //Make new sneaker
                String name = Console.getStringInput("Enter sneaker name:");
                String brand = Console.getStringInput("Enter sneaker brand:");
                String sport = Console.getStringInput("Enter sneaker sport:");
                int size = Console.getIntegerInput("Enter sneaker size:");
                int qty = Console.getIntegerInput("Enter sneaker quantity:");
                float price = Console.getFloatInput("Enter price:");
                //sneakerService.create(name, brand, sport, size, qty, price);
                break;
        }
    }

}
