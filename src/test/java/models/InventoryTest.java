package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.SneakerService;
import services.WhiskeyService;

public class InventoryTest {
    @Test
    public void totalSneakersTest(){
        Inventory inventory = new Inventory();
        SneakerService sneakerService = inventory.getSneakerService();

        Sneaker testSneaker = sneakerService.create("These Jawns", "JawnEx", "Jawning",
                20.5f, 12, 400.12f);
        Sneaker testSneaker2 = sneakerService.create("Them Kicks", "Footstank", "Cripwalking",
                5.0f, 200, 199.99f);

        Integer expected = 212;

        Integer actual = inventory.sneakersInStock();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void totalWhiskeyTest(){
        Inventory inventory = new Inventory();
        WhiskeyService whiskeyService = inventory.getWhiskeyService();

        Whiskey testWhiskey = whiskeyService.create("Ewww Juice", "Get Help", 50,
                20.5f, 125, 100.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Gross Water", "Insolent Quail", 45,
                5.0f, 200, 199.99f);

        Integer expected = 325;
        Integer actual = inventory.whiskeyInStock();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void totalStockTest(){
        Inventory inventory = new Inventory();
        SneakerService sneakerService = inventory.getSneakerService();
        WhiskeyService whiskeyService = inventory.getWhiskeyService();

        Sneaker testSneaker = sneakerService.create("These Jawns", "JawnEx", "Jawning",
                20.5f, 12, 400.12f);
        Sneaker testSneaker2 = sneakerService.create("Them Kicks", "Footstank", "Cripwalking",
                5.0f, 200, 199.99f);

        Whiskey testWhiskey = whiskeyService.create("Ewww Juice", "Get Help", 50,
                20.5f, 125, 100.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Gross Water", "Insolent Quail", 45,
                5.0f, 200, 199.99f);

        Integer expected = 537;

        Integer actual = inventory.totalItemsInStock();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void totalSneakersValueTest(){
        Inventory inventory = new Inventory();
        SneakerService sneakerService = inventory.getSneakerService();

        Sneaker testSneaker = sneakerService.create("These Jawns", "JawnEx", "Jawning",
                20.5f, 12, 400.12f);
        Sneaker testSneaker2 = sneakerService.create("Them Kicks", "Footstank", "Cripwalking",
                5.0f, 200, 199.99f);

        Float expected = 44799.44f;

        Float actual = inventory.totalSneakersValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void totalWhiskeyValueTest(){
        Inventory inventory = new Inventory();
        WhiskeyService whiskeyService = inventory.getWhiskeyService();

        Whiskey testWhiskey = whiskeyService.create("Ewww Juice", "Get Help", 50,
                20.5f, 125, 100.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Gross Water", "Insolent Quail", 45,
                5.0f, 200, 199.99f);

        Float expected = 52498.00f;
        Float actual = inventory.totalWhiskeyValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void totalInventoryValueTest(){
        Inventory inventory = new Inventory();
        SneakerService sneakerService = inventory.getSneakerService();
        WhiskeyService whiskeyService = inventory.getWhiskeyService();

        Sneaker testSneaker = sneakerService.create("These Jawns", "JawnEx", "Jawning",
                20.5f, 12, 400.12f);
        Sneaker testSneaker2 = sneakerService.create("Them Kicks", "Footstank", "Cripwalking",
                5.0f, 200, 199.99f);
        Whiskey testWhiskey = whiskeyService.create("Ewww Juice", "Get Help", 50,
                20.5f, 125, 100.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Gross Water", "Insolent Quail", 45,
                5.0f, 200, 199.99f);

        Float expected = 97297.44f;

        Float actual = inventory.totalInventoryValue();

        Assertions.assertEquals(expected, actual);
    }
}
