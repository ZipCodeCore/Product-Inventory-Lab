package services;

import models.Sneaker;

import org.junit.Test;
import org.junit.Assert;

public class SneakerServiceTest {
    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        Double expectedSize = 10.5;
        Integer expectedQty = 10;
        Float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        Integer actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        Double actualSize = testSneaker.getSize();
        Integer actualQty = testSneaker.getQuantity();
        Float actualPrice = testSneaker.getPrice();

        // (4)
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findSneakerTest() {

    }

    @Test
    public void findAllTest() {

    }

    @Test
    public void deleteTest() {

    }
}