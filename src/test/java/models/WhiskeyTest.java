package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WhiskeyTest {

    private String expectedBrand = "Johnny";
    private int expectedId = 1;
    private int expectedQty = 2;
    private float expectedPrice = 50f;
    Whiskey testWhiskey = new Whiskey(expectedBrand,expectedId,expectedQty,expectedPrice);

    @Test
    public void testSetGetBrand() {
        String expected = "valentin";

        testWhiskey.setBrand(expected);
        Assertions.assertEquals(expected, testWhiskey.getBrand());

    }

    @Test
    public void testSetGetQty(){
        int expected = 32;

        testWhiskey.setQty(expected);
        Assertions.assertEquals(expected,testWhiskey.getQty());
    }

    @Test
    public void testSetGetId(){
        int expected = 32097;

        testWhiskey.setId(expected);
        Assertions.assertEquals(expected,testWhiskey.getId());
    }

    @Test
    public void testConstructor(){
        Whiskey newTest = new Whiskey(expectedBrand,expectedId,expectedQty,expectedPrice);
        Assertions.assertEquals(expectedPrice,testWhiskey.getPrice());
        Assertions.assertEquals(expectedBrand,testWhiskey.getBrand());
        Assertions.assertEquals(expectedId,testWhiskey.getId());
        Assertions.assertEquals(expectedQty,testWhiskey.getQty());
    }
}
