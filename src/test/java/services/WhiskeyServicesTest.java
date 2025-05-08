package services;

import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServicesTest {
    @Test
    public void createTest() {

        // (1)
        String expectedBrand = "Johnny";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedBrand, expectedQty, expectedPrice);

        // (3)
        int actualId = testWhiskey.getId();
        String actualBrand = testWhiskey.getBrand();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
        
    }
}
