package io;
import models.Inventory;
import java.util.Scanner;

public class App {

    public static void main(String... args){
        App application = new App();
        application.init();
    }

    public void init(){
        // (4)
        // application logic here
        // call methods to take user input and interface with services
        Console.initializeSampleInventory();
        Console.printWelcome();
        Console.topMenu();
    }
}
