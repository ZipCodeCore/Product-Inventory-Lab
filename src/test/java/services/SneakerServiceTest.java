package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

        //4
        Assertions.assertEquals(newSneaker,newSneakerService.find(expectedID));
    }

    /**
     * //read all
     * public Sneaker[] findAll() {
     *     // should return a basic array copy of the ArrayList
     * }
     */
    @Test
    public void sneakerServiceFindAllTest() {
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
        Object[] actualSneakerArray = new Sneaker[1];
        actualSneakerArray[0] = newSneaker;
        //4
        Assertions.assertEquals(true, Arrays.equals(actualSneakerArray,newSneakerService.findAll()));
    }

    /**
     * //delete
     * public boolean delete(int id) {
     *     // should remove the object with this id from the ArrayList if exits and return true.
     *     // Otherwise return false
     * }
     */
    @Test
    public void SneakerServiceDeleteTest(){

    }
}

