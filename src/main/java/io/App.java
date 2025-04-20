package io;
import models.Inventory;
import models.Sneaker;
import services.SneakerService;
import utils.CSVUtils;
import utils.JSONUtils;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String... args) throws IOException {
        App application = new App();
        application.init();
        CSVUtils.writeFiles();
        JSONUtils.writeFiles();
    }

    public void init() throws IOException {
        // (4)
        // application logic here
        // call methods to take user input and interface with services

        //Console.initializeSampleInventory();
        //SneakerService.csvFileSaver();
        //CSVUtils.loadFiles();
        JSONUtils.readFiles();
        Console.printWelcome();
        Console.topMenu();
    }
}
