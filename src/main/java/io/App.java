package io;

public class App {
    public static void main(String... args) {
        App application = new App();
        Inventory.putSomeItemsInInventory();
        application.init();
    }
    private void init() {
        Console.printWelcome();
        Console.printOptions();
        Console.options();
    }

}
