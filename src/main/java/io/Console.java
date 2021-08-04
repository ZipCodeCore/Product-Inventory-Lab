package io;

import models.Hat;
import models.Sneaker;
import services.HatService;
import services.SneakerService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Console {

    public static class Inventory {
        private SneakerService sneakerService = new SneakerService();
        private HatService hatService = new HatService();

        public SneakerService getSneakerService() {
            return this.sneakerService;
        }
        public HatService getHatService() {
            return this.hatService;
        }

    }
    private static Inventory inventory = new Inventory();

    public static void sampleInventory()  {
        SneakerService sneakerService = inventory.getSneakerService();
        HatService hatService = inventory.getHatService();

        sneakerService.create("Air Jordan 1", "Nike", "Basketball", 10.5, 200, 170.00F);
        sneakerService.create("Nite Joggers", "Adidas", "Running", 10.5, 50, 120.00F);
        sneakerService.create("Air Force 1", "Nike", "Casual", 10.5, 100, 90.00F);

        hatService.create("Fitted", "Baseball", "New York Yankees", "Medium", 20, 39.99F);
        hatService.create("Snap-back", "Basketball", "Los Angeles Lakers", "Large", 20, 44.99F);
        hatService.create("Strap-back", "Football", "Philadelphia Eagles", "Medium", 20, 34.99F);
    }

    public static void print(String input) {
        System.out.println(input);
    }
    public static void printWelcome() {
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");
    }

       //==============================================================================================//
      // =================================== ~*~ MAIN MENU ~*~ ====================================== //
     // =============================================================================================//
    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("             ~*~ MAIN MENU ~*~ \n" +
                "Please enter a number from the menu options");
        print("1 - Show existing products");
        print("2 - Update products");
        print("3 - Delete products");
        print("Press any other numbers to Quit \n > ");
        input = scanner.nextInt();

        switch(input) {
            case 1:
                // Show Existing products options
                productSelector();
                break;

            case 2:
                // Show Update products options
                updateSelector();
                break;

            case 3:
                // Show Delete products options
                deleteSelector();
                break;

            default:
                print("Quiting Product Inventory Application ... Goodbye");
        }
    }



      //=============================================================================================//
     // ================================ SHOW EXISTING PRODUCTS OPTIONS =========================== //
    //=============================================================================================//
    private static void productSelector() {
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("Enter the number corresponding to the product");
        print("1 - Sneakers");
        print("2 - Hats");
        print("~*~ OR ~*~");
        print("3 - Main Menu");

        input = scanner.nextInt();

        switch(input) {
            case 1:
                // Show sneakers inventory information
                printSneakersList(inventory.getSneakerService().findAll());
                productSelector();
                break;
            case 2:
                // Show hats inventory information
                printHatsList(inventory.getHatService().findAll());
                productSelector();
                break;
            case 3:
                // Go back to main menu
                mainMenu();
                break;
            default:
                print("Please enter a valid number ... Try again!");
                productSelector();
        }

    }

      //=================================================================================================//
     // ================================  INFO GOES INTO PRODUCT SELECTOR  ============================ //
    //=================================================================================================//
    public static void printSneakersList (Sneaker[] list) {
        ArrayList<Sneaker> sneakerList = new ArrayList<>(Arrays.asList(list));

        for (Sneaker element : sneakerList) {
            print(element.getName() + element.getBrand() + element.getSport() + element.getSize() + element.getQuantity() + element.getPrice());
        }
    }
    public static void printHatsList (Hat[] list) {
        ArrayList<Hat> hatList = new ArrayList<>(Arrays.asList(list));

        for (Hat element : hatList) {
            print(element.getType() + element.getSport() + element.getTeam() + element.getSize() + element.getQuantity() + element.getPrice());
        }
    }

      //=================================================================================================//
     // ================================ SHOW UPDATE PRODUCTS OPTIONS ================================= //
    //=================================================================================================//
      private static void updateSelector() {
          Scanner scanner = new Scanner(System.in);
          Integer input;
          print("Enter the number corresponding to the product");
          print("1 - Sneakers");
          print("2 - Hats");
          print("~*~ OR ~*~");
          print("3 - Main Menu");

          input = scanner.nextInt();

          switch (input) {
              case 1:
                  // Allow user to update sneakers

                  updateSelector();
                  break;
              case 2:
                  // Allow user to update hats

                  updateSelector();
                  break;
              case 3:
                  // Go back to main menu
                  mainMenu();
                  break;
              default:
                  print("Please enter a valid number ... Try again!");
                  updateSelector();
          }
      }




      //=================================================================================================//
     // ================================ SHOW DELETE PRODUCTS OPTIONS ================================= //
    //=================================================================================================//

    private static void deleteSelector() {
        Scanner scanner = new Scanner(System.in);
        Integer input;
        print("Enter the number corresponding to the product");
        print("1 - Sneakers");
        print("2 - Hats");
        print("~*~ OR ~*~");
        print("3 - Main Menu");

        input = scanner.nextInt();

        switch (input) {
            case 1:
                // Allow user to delete sneaker

                deleteSelector();
                break;
            case 2:
                // Allow user to delete hat

                deleteSelector();
                break;
            case 3:
                // Go back to main menu
                mainMenu();
                break;
            default:
                print("Please enter a valid number ... Try again!");
                deleteSelector();
        }
    }


}
