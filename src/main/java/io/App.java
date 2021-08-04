package io;

import services.SneakerService;

public class App {
    private SneakerService sneakerService = new SneakerService();

    public static void main(String... args){
        App application = new App();
        application.init();
    }

    private void init() {
        // application logic here
        // call methods to take user input and interface with services


        Console.printWelcome();
        Console.mainMenu();
    }



}
