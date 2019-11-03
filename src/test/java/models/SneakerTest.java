package models;

import org.junit.Assert;
import org.junit.Test;

public class SneakerTest {
    @Test
    public void constructorTest() {
// (2)
        Integer expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        Double expectedSize = 11.5;
        Integer expectedQty = 10;
        Float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSport, testSneaker.getSport());
        Assert.assertEquals(expectedSize, testSneaker.getSize());
        Assert.assertEquals(expectedQty, testSneaker.getQuantity());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice());
    }

//    @Test
//    public void getIdTest() {
//
//    }

    @Test
    public void setIdTest() {
        Integer expected = 78;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);

        Assert.assertEquals(expected, testSneaker.getId());
    }

//    @Test
//    public void getNameTest() {
//
//    }

    @Test
    public void setNameTest() {
        String expected = "Shoename";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        Assert.assertEquals(expected, testSneaker.getName());
    }

//    @Test
//    public void getBrandTest() {
//
//    }

    @Test
    public void setBrandTest() {
        String expected = "Nike";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        Assert.assertEquals(expected, testSneaker.getBrand());
    }

//    @Test
//    public void getSportTest() {
//
//    }

    @Test
    public void setSportTest() {
        String expected = "Climbing";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        Assert.assertEquals(expected, testSneaker.getSport());
    }

//    @Test
//    public void getSizeTest() {
//
//    }

    @Test
    public void setSizeTest() {
        Double expected = 12.5;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        Assert.assertEquals(expected, testSneaker.getSize());
    }

//    @Test
//    public void getQuantityTest() {
//
//    }

    @Test
    public void setQuantityTest() {
        Integer expected = 1300;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setQuantity(expected);

        Assert.assertEquals(expected, testSneaker.getQuantity());
    }

//    @Test
//    public void getPriceTest() {
//
//    }

    @Test
    public void setPriceTest() {
        Float expected = 98.78f;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        Assert.assertEquals(expected, testSneaker.getPrice());

    }
}