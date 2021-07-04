package services;

import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {
    @Test
    public void createTest() {

        // (1)
        String expectedName = "Turkey Sipps";
        String expectedBrand = "Snargaluks";
        int expectedProof = 40;
        float expectedSize = 18.7f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedName, expectedBrand,
                expectedProof, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        int actualProof = testWhiskey.getProof();
        double actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedProof, actualProof);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findSneakerTest() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create("Fred's Dirty Whiskey", "Don't Drink",
                45, 55.0f, 1000, 20.99f);
        Object expected = null;
        Object expected2 = testWhiskey;
        Object actual = whiskeyService.findWhiskey(2);
        Object actual2 = whiskeyService.findWhiskey(1);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void findAllWhiskeyTest() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create("Ewww Juice", "Get Help", 50,
                20.5f, 12, 100.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Them Kicks", "Footstank", 45,
                5.0f, 200, 199.99f);

        Whiskey[] expected = {testWhiskey, testWhiskey2};

        Whiskey[] actual = whiskeyService.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteWhiskeyTest() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create("Ewww Juice", "Get Help", 50,
                20.5f, 12, 100.00f);
        Whiskey testWhiskey2 = whiskeyService.create("Them Kicks", "Footstank", 45,
                5.0f, 200, 199.99f);

        Boolean expected = true;
        Boolean expected2 = false;

        Boolean actual = whiskeyService.delete(1);
        Boolean actual2 = whiskeyService.delete(5);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}
