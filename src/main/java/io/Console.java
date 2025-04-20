package io;

import java.util.Scanner;

public class Console {

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
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public static Float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        return Float.parseFloat((scanner.nextLine()));
    }

    public static void options() {
        boolean exitNow = false;
        while(exitNow == false){
            Integer option = Console.getIntegerInput("Type number to choose option:");
            switch (option) {
                case 1:
                    Inventory.makeNewProduct();
                    break;
                case 2:
                    //View current inventory
                    Inventory.viewInventory();
                    break;
                case 3:
                    //Update product - delete product
                    Inventory.removeProduct();
                    break;
                case 4:
                    //View product reports
                    Inventory.viewProduct();
                    break;
                case 5:
                    //Exit
                    exitNow = true;
                    break;
            }
        }
    }


}
