package services;

import models.Sneaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SneakerServiceTest {
    SneakerService sneakerService=new SneakerService();
    ArrayList<Sneaker>inventory=new ArrayList<>();
    @Before
    public void setUp(){
      sneakerService.create("rosy","fitFlop","badminton",4.5f,1,90.99f);
      sneakerService.create("navy","lotus","cricket",3.0f,4,45.00f);
    }

    @Test
    public void createTest() {

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        SneakerService sneakerService = new SneakerService();
        Sneaker sneaker=sneakerService.create(expectedName,expectedBrand,expectedSport,expectedSize,expectedQty,expectedPrice);
        int actualId = sneaker.getId();
        String actualName = sneaker.getName();
        String actualBrand = sneaker.getBrand();
        String actualSport = sneaker.getSport();
        float actualSize = sneaker.getSize();
        int actualQty = sneaker.getQty();
        float actualPrice = sneaker.getPrice();
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize,0.0);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice,0.0);

    }

   @Test
   public void findSneakerTest(){
       // int expectedId = 1;
        String expectedName = "Mary Jane";
       String expectedBrand = "Bata";
       String expectedSport = "soccer";
       float expectedSize = 6.5f;
       int expectedQty = 5;
       float expectedPrice = 60.00f;
       Sneaker expected =  sneakerService.create(expectedName,expectedBrand,expectedSport,expectedSize,expectedQty,expectedPrice);
        Sneaker actual = sneakerService.findSneaker(1);
        Assert.assertEquals(expected,actual);

   }
   @Test
   public void testFindAll(){
    Sneaker[]actual= sneakerService.findAll();
   // Sneaker[] expected =
       for (int i = 0; i < inventory.size(); i++) {
           System.out.printf(inventory.get(i).toString());

       }
       System.out.println(Arrays.toString(actual));
    System.out.println(actual.length);
    }

@Test
    public void deleteTest(){
        Boolean b = sneakerService.delete(1);
        Sneaker s2 = sneakerService.findSneaker(2);
        //System.out.println(expected);
        Sneaker s1 = sneakerService.findSneaker(1);
        Assert.assertNull(s1);
        Assert.assertNotNull(s2);


}

}