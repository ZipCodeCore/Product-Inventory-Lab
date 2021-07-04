package io;

import Services.ChocolateService;
import Services.ClothingService;

public class App {
    private ClothingService sneakerService = new ClothingService(); // (1)
    private ChocolateService chocolateService =new ChocolateService();

    public static void main(String... args){


            App application = new App(); // (2)
            application.init();  // (3)


        }

        public void init(){
            // (4)
            // application logic here
            // call methods to take user input and interface with services
            Console.printWelcome();
            String options = Console.getStringInput("Choose an option\n" +
                    "1.Create chocolate\n"+
                    "2.Read Inventory of \n"+
                    "3.Update Product"+
                    "4.Delete Product"+
                    "5.");
            switch (options)
            {
                case  "1":
                    break;
            }
            Console.println("Enter Chocolate details:");
            String brand="";
            String type ="";
            int quantity=0;
            float price=0;

            brand = Console.getStringInput("Enter brand");
            type = Console.getStringInput("Enter type");
            quantity= Console.getIntegerInput("Enter quantity");
            price= Console.getIntegerInput("Enter price");

            chocolateService.create(brand,type,quantity,price);
            Console.println("Chocolate inventory"+brand+" created");

        }
    }

