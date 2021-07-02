package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShirtTest {
    Shirt shirt = new Shirt();

    @Test
    public void getTypeTest(){
        //Given
        String expected = "Button down";
        shirt.setShirtType(expected);
        //When
        String actual = shirt.getShirtType();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    public void getBrandTest(){
        //Given
        String expected = "Gucci";
        shirt.setBrand(expected);
        //When
        String actual = shirt.getBrand();
        //Then
        Assertions.assertEquals(expected, actual);
    }
    public void getMaterialTest(){
        //Given
        String expected = "Cotton";
        shirt.setMaterial(expected);
        //When
        String actual = shirt.getMaterial();
        //Then
        Assertions.assertEquals(expected, actual);
    }
    public void getQuantityTest(){
        //Given
        int expected = 25;
        shirt.setQuantity(expected);
        //When
        int actual = shirt.getQuantity();
        //Then
        Assertions.assertEquals(expected, actual, 0);
    }
    public void getPriceTest(){
        //Given
        double expected = 25.99;
        shirt.setPrice(expected);
        //When
        double actual = shirt.getPrice();
        //Then
        Assertions.assertEquals(expected, actual);
    }

}
