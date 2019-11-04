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
        SneakerService sneakerService = new SneakerService();
        for (int i = 0; i < 5; i++) {
            sneakerService.create("name"+i, "brand"+i, "sport"+i, 1.1, 34, 45.44f);
        }
        Sneaker actual = sneakerService.findSneaker(4);
        Sneaker expected = new Sneaker(4, "name3", "brand3", "sport3", 1.1, 34, 45.44f);
        Assert.assertEquals(expected.getId(), actual.getId());
        Assert.assertEquals(expected.getName(), actual.getName());
        Assert.assertEquals(expected.getBrand(), actual.getBrand());
        Assert.assertEquals(expected.getQuantity(), actual.getQuantity());
        Assert.assertEquals(expected.getPrice(), actual.getPrice());
    }

    @Test
    public void findAllTest() {
        Sneaker[] expected = new Sneaker[5];
        SneakerService sneakerService = new SneakerService();
        for (int i = 0; i < 5; i++) {
            expected[i] = sneakerService.create("name"+i, "brand"+i, "sport"+i, 1.1, 34, 45.44f);
        }
        Sneaker[] actual = sneakerService.findAll();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void deleteTest() {

    }
}