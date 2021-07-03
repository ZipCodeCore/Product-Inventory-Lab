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
        //Sneaker 1
        int expectedID = 1;
        String expectedName = "NitroBalance";
        String expectedBrand = "Nike";
        String expectedSport = "Basket Ball";
        int expectedSize = 11;
        int expectedQty = 10;
        float expectedPrice = 75.00f;
        //Sneaker2
        int expectedID2 = 2;
        String expectedName2 = "RocketFeet";
        String expectedBrand2 = "NewBalance";
        String expectedSport2 = "Running";
        int expectedSize2 = 6;
        int expectedQty2 = 20;
        float expectedPrice2 = 90.00f;

        //2
        SneakerService newSneakerService1 = new SneakerService();
        //Making sneaker1
        Sneaker newSneaker = newSneakerService1.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        //Making sneaker2
        Sneaker newSneaker2 = newSneakerService1.create(expectedName2, expectedBrand2, expectedSport2, expectedSize2, expectedQty2, expectedPrice2);
        //3
        //4
        Assertions.assertEquals(newSneaker2,newSneakerService1.find(expectedID2));
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
        //1
        int expectedID1 = 1;
        String expectedName = "NitroBalance";
        String expectedBrand = "Nike";
        String expectedSport = "Basket Ball";
        int expectedSize = 11;
        int expectedQty = 10;
        float expectedPrice = 75.00f;

        int expectedID2 = 2;
        String expectedName2 = "BubbleGum";
        String expectedBrand2 = "Adidas";
        String expectedSport2 = "Tennis";
        int expectedSize2 = 9;
        int expectedQty2 = 20;
        float expectedPrice2 = 80.00f;

        //2
        SneakerService newSneakerService = new SneakerService();
        Sneaker newSneaker1 = newSneakerService.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        Sneaker newSneaker2 = newSneakerService.create(expectedName2, expectedBrand2, expectedSport2, expectedSize2, expectedQty2, expectedPrice2);

        //Test 1
        boolean deleteResult = newSneakerService.delete(expectedID2);
        Assertions.assertEquals(true, deleteResult);

        //Test 2
        boolean deleteResult2 = newSneakerService.delete(expectedID2);
        Assertions.assertEquals(false, deleteResult2);




    }
}

