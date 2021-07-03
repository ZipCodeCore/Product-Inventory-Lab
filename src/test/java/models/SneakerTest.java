package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    @Test
    public void setNameTest(){
        //Given
        String expected = "OZWEEGO";
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);
        //Then
        Assertions.assertEquals(expected,testSneaker.getName());
    }
    @Test
    public void setBrandTest(){
        //Given
        String expected = "Nike";
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);
        //Then
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }
    @Test
    public void setSportTest(){
        //Given
        String expected = "Running";
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);
        //Then
        Assertions.assertEquals(expected,testSneaker.getSport());
    }
    @Test
    public void setSizeTest(){
        //Given
        int expected = 7;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);
        //Then
        Assertions.assertEquals(expected,testSneaker.getSize());
    }
    @Test
    public void setQuantityTest(){
        //Given
        int expected = 50;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQuantity(expected);
        //Then
        Assertions.assertEquals(expected,testSneaker.getQuantity());
    }
    @Test
    public void setPriceTest(){
        //Given
        float expected = 99.99f;
        //When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);
        //Then
        Assertions.assertEquals(expected,testSneaker.getPrice());
    }

    @Test
    public void constructorTest() {
        //Given
        int expectedID = 01;
        String expectedName = "SpeedForce";
        String expectedBrand = "Sketchers";
        String expectedSport = "Training";
        int expectedSize = 8;
        int expectedQuantity = 26;
        float expectedPrice = 78.99f;
        //When
        Sneaker testSneaker = new Sneaker(expectedID,expectedName, expectedBrand, expectedSport, expectedSize, expectedQuantity, expectedPrice);
        //Then
        Assertions.assertEquals(expectedID, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedSize, testSneaker.getSize());
        Assertions.assertEquals(expectedQuantity, testSneaker.getQuantity());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());


    }
}
