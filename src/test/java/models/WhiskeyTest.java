package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiskeyTest {
    int expectedId;
    String expectedName;
    String expectedBrand;
    float expectedPrice;
    @Before
    public void setUp() {
        expectedId = 6;
        expectedName = "passion";
        expectedBrand = "bagpiper";
        expectedPrice = 70.50f;
        Whiskey whiskey = new Whiskey(expectedId, expectedName, expectedBrand,expectedPrice);
    }
    @Test
    public void constructorTest(){
        expectedId = 6;
        expectedName = "passion";
        expectedBrand = "bagpiper";
        Whiskey whiskey = new Whiskey(expectedId, expectedName, expectedBrand,expectedPrice);
        Assert.assertEquals(expectedId, whiskey.getId());
        Assert.assertEquals(expectedName, whiskey.getName());
        Assert.assertEquals(expectedBrand, whiskey.getBrand());
        Assert.assertEquals(expectedPrice,whiskey.getPrice(),0.001);
    }
    @Test
    public void testSetterMethods() {
        Whiskey whiskey = new Whiskey(2,"torque","sunshine",70.50f);
        whiskey.setId(expectedId);
        whiskey.setName(expectedName);
        whiskey.setBrand(expectedBrand);
        whiskey.setPrice(expectedPrice);
        Assert.assertEquals(expectedId, whiskey.getId());
        Assert.assertEquals(expectedName, whiskey.getName());
        Assert.assertEquals(expectedBrand, whiskey.getBrand());
        Assert.assertEquals(expectedPrice,whiskey.getPrice(),0.001);

    }

}
