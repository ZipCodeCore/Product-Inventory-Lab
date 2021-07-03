package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {
    @Test
    public void createTest(){
        //1
        String expectedName = "NitroBalance";
        String expectedBrand = "Nike";
        String expectedSport = "Basket Ball";
        int expectedSize = 11;
        int expectedQty = 10;
        float expectedPrice = 75.00f;

        //2
        SneakerService newSneakerService = new SneakerService();
        Sneaker testSneaker = newSneakerService.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        //3
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        int actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQuantity();
        float actualPrice = testSneaker.getPrice();
        //4
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    /**
     * should take an int and return an object with that id, if it exists.
     */
    @Test
    public void findTest(){
        //1
        int expectedID = 1;
        String expectedName = "NitroBalance";
        String expectedBrand = "Nike";
        String expectedSport = "Basket Ball";
        int expectedSize = 11;
        int expectedQty = 10;
        float expectedPrice = 75.00f;
        //2
        SneakerService newSneakerService = new SneakerService();
        Sneaker newSneaker = newSneakerService.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        //3
        Sneaker actualSneaker = newSneakerService.find(expectedID);
        //4
        Assertions.assertEquals(expectedID,actualSneaker.getId());
    }

    /**
     * //read all
     * public Sneaker[] findAll() {
     *     // should return a basic array copy of the ArrayList
     * }
     */
    @Test
    
}
