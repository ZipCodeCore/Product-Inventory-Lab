package models;

import org.junit.Assert;
import org.junit.Test;

public class WhiskeyTest {
    @Test
    public void constructorTest() {
// (2)
        Integer expectedId = 6;
        String expectedName = "Delishkey";
        String expectedBrand = "FancyWhiskey";
        Integer expectedQty = 10;
        Float expectedPrice = 80.00f;

        // (3)
        Whiskey testWhiskey = new Whiskey(expectedId, expectedName, expectedBrand, expectedQty,expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testWhiskey.getId());
        Assert.assertEquals(expectedName, testWhiskey.getName());
        Assert.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assert.assertEquals(expectedQty, testWhiskey.getQuantity());
        Assert.assertEquals(expectedPrice, testWhiskey.getPrice());
    }

    @Test
    public void setIdTest() {
        Integer expected = 78;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        Assert.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setNameTest() {
        String expected = "whiskeyname";

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);

        Assert.assertEquals(expected, testWhiskey.getName());
    }

    @Test
    public void setBrandTest() {
        String expected = "whiskeybrand";

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        Assert.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    public void setQuantityTest() {
        Integer expected = 1300;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQuantity(expected);

        Assert.assertEquals(expected, testWhiskey.getQuantity());
    }

    @Test
    public void setPriceTest() {
        Float expected = 98.78f;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        Assert.assertEquals(expected, testWhiskey.getPrice());

    }
}