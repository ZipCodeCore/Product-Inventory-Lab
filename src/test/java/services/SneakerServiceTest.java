package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {
    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        double actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    public void findSneakerTest(){
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create("La Lights", "Reebok", "BasketballAtNight",
                13.5f, 15, 79.99f);
        Object expected = null;
        Object expected2 = testSneaker;
        Object actual = sneakerService.findSneaker(2);
        Object actual2 = sneakerService.findSneaker(1);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void findAllSneakerTest(){
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create("These Jawns", "JawnEx", "Jawning",
                20.5f, 12, 400.12f);
        Sneaker testSneaker2 = sneakerService.create("Them Kicks", "Footstank", "Cripwalking",
                5.0f, 200, 199.99f);

        Sneaker[] expected = {testSneaker, testSneaker2};

        Sneaker[] actual = sneakerService.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void deleteSneakerTest(){
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create("These Jawns", "JawnEx", "Jawning",
                20.5f, 12, 400.12f);
        Sneaker testSneaker2 = sneakerService.create("Them Kicks", "Footstank", "Cripwalking",
                5.0f, 200, 199.99f);

        Boolean expected = true;
        Boolean expected2 = false;

        Boolean actual = sneakerService.delete(1);
        Boolean actual2 = sneakerService.delete(5);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}
