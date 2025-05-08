package models;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestTemplate;


public class SneakerTest {
    int expectedId;
    String expectedName;
    String expectedBrand;
    String expectedSport;
    float expectedSize;
    int expectedQty;

    float expectedPrice;

    @Before
    public void setUp() {
        expectedId = 6;
        expectedName = "Stan Smith";
        expectedBrand = "Adidas";
        expectedSport = "Tennnis";
        expectedSize = 10.0f;
        expectedQty = 10;
        expectedPrice = 80.00f;
        Sneaker sneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);

    }

    @Test
    public void nameTest() {
        Sneaker sneaker = new Sneaker(6, "", "", "", 10, 2, 99.90f);
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        float expectedSize = 10.0f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;
    }

    @Test
    public void constructorTest() {

        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        float expectedSize = 10.0f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        Sneaker sneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        Assert.assertEquals(expectedId, sneaker.getId());
        Assert.assertEquals(expectedName, sneaker.getName());
        Assert.assertEquals(expectedBrand, sneaker.getBrand());
        Assert.assertEquals(expectedSport, sneaker.getSport());
        Assert.assertEquals(expectedQty, sneaker.getQty());
        Assert.assertEquals(expectedPrice, sneaker.getPrice(), 0.0);

    }

    @Test
    public void testSetterMethods() {
        Sneaker sneaker = new Sneaker(8, "Dan Smith", "Flojo", "Tennis", 8.5f, 2, 80f);
        sneaker.setId(expectedId);
        sneaker.setName(expectedName);
        sneaker.setBrand(expectedBrand);
        sneaker.setSport(expectedSport);
        sneaker.setSize(expectedSize);
        sneaker.setQty(expectedQty);
        sneaker.setPrice(expectedPrice);


        Assert.assertEquals(expectedId, sneaker.getId());
        Assert.assertEquals(expectedName, sneaker.getName());
        Assert.assertEquals(expectedBrand, sneaker.getBrand());
        Assert.assertEquals(expectedSport, sneaker.getSport());
        Assert.assertEquals(expectedQty, sneaker.getQty());
        Assert.assertEquals(expectedPrice, sneaker.getPrice(), 0.0);
    }

}
