package services;

import models.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class SneakerServiceTest {
    @Test
    public void createTest() {

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        SneakerService sneakerService = new SneakerService();
        Sneaker sneaker=sneakerService.create(expectedName,expectedBrand,expectedSport,expectedSize,expectedQty,expectedPrice);
        int actualId = sneaker.getId();
        String actualName = sneaker.getName();
        String actualBrand = sneaker.getBrand();
        String actualSport = sneaker.getSport();
        float actualSize = sneaker.getSize();
        int actualQty = sneaker.getQty();
        float actualPrice = sneaker.getPrice();
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize,0.0);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice,0.0);

    }
}