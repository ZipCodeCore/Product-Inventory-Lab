package services;

import models.Sneaker;
import models.Whiskey;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class WhiskeyServiceTest {
    //this is whiskey

        WhiskeyService whiskeyService;


        @Before
        public void setUp() throws Exception {
            whiskeyService = new WhiskeyService();
            whiskeyService.create("passion", "bagpiper", 70.00f);
            whiskeyService.create("ronjo", "samuel",  45.00f);
        }

        @After
        public void tearDown() throws Exception {
            WhiskeyService.setNextId(1);
        }
    @Test
    public void createTest() {

        // (1)
        String expectedName = "rainFall";
        String expectedBrand = "axe";
        float expectedPrice = 80.00f;
//        SneakerService sneakerService = new SneakerService();
        Whiskey whiskey = whiskeyService.create(expectedName, expectedBrand, expectedPrice);
        int actualId = whiskey.getId();
        String actualName = whiskey.getName();
        String actualBrand = whiskey.getBrand();
        float actualPrice = whiskey.getPrice();

        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedPrice, actualPrice, 0.0);
    }

        @Test
    public void findWhiskeyTest() {
        // int expectedId = 3;
        String expectedName = "downFall";
        String expectedBrand = "reene";
        float expectedPrice = 60.00f;
        Whiskey expected = whiskeyService.create(expectedName, expectedBrand,  expectedPrice);
       Whiskey actual = whiskeyService.findWhiskey(3);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindAll() {
        Whiskey[] actual = whiskeyService.findAll();
        // Sneaker[] expected =
        for (int i = 0; i < actual.length; i++) {
            System.out.printf(actual[i].toString());

        }
        System.out.println(Arrays.toString(actual));
        System.out.println(actual.length);
        Assert.assertEquals(2, actual.length);
    }

    @Test
    public void deleteTest() {
        Boolean b = whiskeyService.delete(1);
        Whiskey s2 = whiskeyService.findWhiskey(2);
        //System.out.println(expected);
        Whiskey s1 = whiskeyService.findWhiskey(1);
        Assert.assertNull(s1);
        Assert.assertNotNull(s2);


    }
}
