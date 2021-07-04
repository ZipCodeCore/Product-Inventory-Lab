package io;

import Models.Chocolate;
import Models.Clothing;
import Services.ChocolateService;
import Services.ClothingService;

public class App {
    private ClothingService clothingService = new ClothingService(); // (1)
    private ChocolateService chocolateService =new ChocolateService();
    private Chocolate chocolate=new Chocolate();
    private Clothing clothing = new Clothing();

    public static void main(String... args){


            App application = new App(); // (2)
            application.init();  // (3)


        }

        public void init(){
            // (4)
            // application logic here
            // call methods to take user input and interface with services
            Console.printWelcome();
            String brand="";
            String type ="";
            int quantity=0;
            float price=0;
            Boolean exitProgram=false;

            do{
                String options = Console.getStringInput("Choose an option\n" +
                        "1.Create chocolate\n" +
                        "2.Read Inventory of \n" +
                        "3.Update Product \n" +
                        "4.Delete Product \n" +
                        "5.Exit the program \n");


                switch (options) {
                    case "1":
                        Console.println("Enter Chocolate details:");


                        brand = Console.getStringInput("Enter brand");
                        type = Console.getStringInput("Enter type");
                        quantity = Console.getIntegerInput("Enter quantity");
                        price = Console.getIntegerInput("Enter price");

                        chocolateService.create(brand, type, quantity, price);
                        Console.println("Chocolate inventory :" + brand + " created");
                        break;

                    case "2":
                        brand = Console.getStringInput("Enter brand to find inventory of chocolate:");
                        chocolate = chocolateService.findChocolate(brand);
                        Console.println("Product details: brand: "+chocolate.getBrand() +
                                " quantity: "+chocolate.getQuantity()+" price: "+chocolate.getPrice());
                        break;

                    case "3":
                        brand = Console.getStringInput("Enter brand to update inventory");
                        quantity=Console.getIntegerInput("Enter the quantity you want to update:");
                        Boolean updateQty = chocolateService.update(brand,quantity);
                        if(updateQty==true){
                            Console.println("Quantity updated");
                        }
                        else Console.println("Product not found");
                        break;

                    case "4":
                        brand = Console.getStringInput("Enter the brand of the product you want to delete:");
                        Boolean checkDelete = chocolateService.delete(brand);
                        if(checkDelete==true){
                            Console.println("Product Deleted");
                        }
                        else Console.println("Product not found");
                        break;

                    case "5":
                        exitProgram=true;
                        Console.println("Program Exited:Goodbye");
                        break;

                }
            }
            while(exitProgram==false);
        }
    }

