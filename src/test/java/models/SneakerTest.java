package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void setSneakerIdTest() {
        //Given
        int expected = 7001;

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSneakerId(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getSneakerId());
    }

    @Test
    public void setNameTest() {
        // Given
        String expected = "YeezyBoost 700";

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {
        //Given
        String expected = "Adidas";

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        //Given
        String expected = "Running";

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        //Given
        double expected = 10.5;

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQuantityTest() {
        //Given
        int expected = 20;

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQuantity(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getQuantity());
    }

    @Test
    public void setPriceTest() {
        //Given
        float expected = 200.00F;

        // When
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        // Then
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }


}
