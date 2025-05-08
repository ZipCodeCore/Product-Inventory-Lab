package models;

import services.CoffeeService;

import java.io.IOException;

public class MainApplication {

    private CoffeeService coffeeService = new CoffeeService();

    public static void main(String[] args) throws IOException {
        MainApplication mainApp = new MainApplication();
        mainApp.init();
    }

    public void init() throws IOException {
        Console.printWelcome();
        Console.initializeSampleInventory();
        //CoffeeService.loadData();
        CoffeeService.fileSaver();
        Console.entryMenu();
    }
}
