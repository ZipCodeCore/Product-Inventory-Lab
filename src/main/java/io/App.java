package io;

import Models.Chocolate;
import Models.Clothing;
import Services.ChocolateService;
import Services.ClothingService;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    private ClothingService clothingService = new ClothingService(); // (1)
    private ChocolateService chocolateService =new ChocolateService();
    private Chocolate chocolate=new Chocolate();
    private Clothing clothing = new Clothing();

    public static void main(String... args) throws IOException {


            App application = new App(); // (2)
            application.init();  // (3)


        }

        public void init() throws IOException {
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
                        "5.Save to Json \n"+
                        "6.Read from Json \n"+
                        "7.Exit the program \n");


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
                        chocolateService.writeJson();
                        Console.println("Value saved to chocolate.json");
                        break;
                    case "6":
                        ArrayList<Chocolate> chocolates = chocolateService.readJson();
                        //chocolateService.in
                        for (Chocolate s:chocolates
                             ) {
                            Console.println("Brand:"+s.getBrand()+"\n");
                            Console.println("Type:"+s.getType()+"\n");
                            Console.println("Quantity:"+s.getQuantity()+"\n");
                            Console.println("Price:"+s.getPrice()+"\n");
                        }

                        break;

                    case "7":
                        exitProgram=true;
                        Console.println("Program Exited:Goodbye");
                        break;

                }
            }
            while(exitProgram==false);
        }
    }

