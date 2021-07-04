package io;

import services.ShirtService;
import services.SneakerService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private ShirtService shirtService = new ShirtService();

    public static void main(String... args) {
        App application = new App();
        application.init();

    }

    private void init() {
        Console.printWelcome();
        Console.printOptions();
        Console.options();

    }




}
