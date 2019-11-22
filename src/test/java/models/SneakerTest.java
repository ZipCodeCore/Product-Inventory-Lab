package models;


import org.junit.Assert;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestTemplate;



public class SneakerTest {
    @Test
     public void nameTest(){
        Sneaker sneaker=new Sneaker(6,"","","",10,2,99.90f);
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;
    }
    @Test
    public void constructorTest(){

        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        float expectedSize=10f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        Sneaker sneaker=new Sneaker(expectedId,expectedName,expectedBrand,expectedSport,expectedSize,expectedQty,expectedPrice);
        Assert.assertEquals(expectedId, sneaker.getId());
        Assert.assertEquals(expectedName, sneaker.getName());
        Assert.assertEquals(expectedBrand, sneaker.getBrand());
        Assert.assertEquals(expectedSport, sneaker.getSport());
        Assert.assertEquals(expectedQty, sneaker.getQty());
        Assert.assertEquals(expectedPrice, sneaker.getPrice(),0.0);

    }

}
