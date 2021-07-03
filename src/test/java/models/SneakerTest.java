package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    int expectedId = 6;
    String expectedName = "Stan Smith";
    String expectedBrand = "Adidas";
    String expectedSport = "Tennnis";
    float expectedSize = 10.5f;
    int expectedQty = 10;
    float expectedPrice = 80.00f;

    Sneaker testSneaker = new Sneaker(expectedId,expectedName,expectedBrand,expectedSport,expectedSize,expectedQty,expectedId);

    @Test
    public void testSetGetName() {
        String expected = "oleg";

        testSneaker.setName(expected);
        Assertions.assertEquals(expected, testSneaker.getName());

    }

    @Test
    public void testSetGetBrand() {
        String expected = "valentin";

        testSneaker.setBrand(expected);
        Assertions.assertEquals(expected, testSneaker.getBrand());

    }

    @Test
    public void testSetGetSize(){
        float expected = 23f;

        testSneaker.setSize(expected);
        Assertions.assertEquals(expected,testSneaker.getSize());
    }

    @Test
    public void testSetGetQty(){
        int expected = 32;

        testSneaker.setQty(expected);
        Assertions.assertEquals(expected,testSneaker.getQty());
    }

    @Test
    public void testSetGetPrice(){
        float expected = 120.00f;

        testSneaker.setPrice(expected);
        Assertions.assertEquals(expected,testSneaker.getPrice());
    }

    @Test
    public void testSetGetSport(){
        String expected = "Soccer";

        testSneaker.setSport(expected);
        Assertions.assertEquals(expected,testSneaker.getSport());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)


        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }
}
