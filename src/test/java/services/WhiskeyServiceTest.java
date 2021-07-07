package services;

import models.Whiskey;
import org.junit.Assert;
import org.junit.Test;

public class WhiskeyServiceTest {
    @Test
    public void createTest(){

        String expectedName = "Delishkey";
        String expectedBrand = "FancyWhiskey";
        Integer expectedQty = 10;
        Float expectedPrice = 80.00f;

        // (3)
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedName, expectedBrand, expectedQty, expectedPrice);
        // (4)
        Assert.assertEquals(expectedName, testWhiskey.getName());
        Assert.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assert.assertEquals(expectedQty, testWhiskey.getQuantity());
        Assert.assertEquals(expectedPrice, testWhiskey.getPrice());
    }

    @Test
    public void findWhiskeyTest() {
        WhiskeyService whiskeyService = new WhiskeyService();
        for (int i = 0; i < 5; i++) {
            whiskeyService.create("name"+i, "brand"+i, 34, 45.44f);
        }
        Whiskey actual = whiskeyService.findWhiskey(4);
        Whiskey expected = new Whiskey(4, "name3", "brand3",34, 45.44f);
//        Assert.assertEquals(expected.getId(), actual.getId());
        Assert.assertEquals(expected.getName(), actual.getName());
        Assert.assertEquals(expected.getBrand(), actual.getBrand());
        Assert.assertEquals(expected.getQuantity(), actual.getQuantity());
        Assert.assertEquals(expected.getPrice(), actual.getPrice());
    }

    @Test
    public void findAllTest() {
        Whiskey[] expected = new Whiskey[5];
        WhiskeyService whiskeyService = new WhiskeyService();
        for (int i = 0; i < 5; i++) {
            expected[i] = whiskeyService.create("name"+i, "brand"+i, 34, 45.44f);
        }
        Whiskey[] actual = whiskeyService.findAll();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest1() {
        Whiskey[] expected = new Whiskey[5];
        WhiskeyService whiskeyService = new WhiskeyService();
        for (int i = 0; i < 5; i++) {
            expected[i] = whiskeyService.create("name"+i, "brand"+i, 34, 45.44f);
        }
        Boolean actual = whiskeyService.delete(4);
        Assert.assertTrue(actual);
    }
    @Test
    public void deleteTest2() {
        Whiskey[] expected = new Whiskey[5];
        WhiskeyService whiskeyService = new WhiskeyService();
        for (int i = 0; i < 5; i++) {
            expected[i] = whiskeyService.create("name"+i, "brand"+i, 34, 45.44f);
        }
        whiskeyService.delete(4);
        Whiskey[] actual = whiskeyService.findAll();
        Assert.assertNotEquals(expected, actual);
    }
}
