package io;
import services.SneakerService;

import java.io.IOException;

public class App {
    public static void main(String... args) throws IOException {

        App application = new App();
        Inventory.putSomeItemsInInventory();
        application.init();

        // Creating a new CSV file
        //SneakerService.makeCSVfile();

    }
    private void init() throws IOException {
        Console.printWelcome();
        Console.printOptions();
        Console.options();
        //SneakerService.makeCSVfile();
        SneakerService.loadData();

    }

}
