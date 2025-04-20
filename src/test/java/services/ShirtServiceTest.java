package services;

import models.Shirt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ShirtServiceTest {
    @Test
    public void createShirtTest(){
        //1
        int expectedId = 1;
        String expectedShirtType = "V-neck";
        String expectedBrand = "J crew";
        String expectedMaterial = "Polyester";
        int expectedQuantity = 10;
        float expectedPrice = 25.00f;
        //2
        ShirtService newShirtService = new ShirtService();
        Shirt testShirt = newShirtService.create(expectedShirtType, expectedBrand, expectedMaterial, expectedQuantity, expectedPrice);
        //3
        int actualId = testShirt.getId();
        String actualShirtType = testShirt.getShirtType();
        String actualBrand = testShirt.getBrand();
        String actualMaterial = testShirt.getMaterial();
        int actualQuantity = testShirt.getQuantity();
        float actualPrice = testShirt.getPrice();
        //4
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedShirtType, actualShirtType);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedMaterial, actualMaterial);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findShirtTest(){
        //Given
        int expId = 1;
        String expShirtType = "Blouse";
        String expBrand = "Zara";
        String expMaterial = "Wool";
        int expQuantity = 15;
        float expPrice = 50.00f;
        ShirtService newShirtService1 = new ShirtService();
        Shirt newBlouse = newShirtService1.create(expShirtType, expBrand, expMaterial, expQuantity, expPrice);
        //When

        //Then
        Assertions.assertEquals(newBlouse, newShirtService1.find(expId));


    }

    @Test
    public void findAllShirtTest(){
        //1
        //Shirt 1
        int expId = 1;
        String expShirtType = "Button-Down";
        String expBrand = "Puma";
        String expMaterial = "Cotton";
        int expQuantity = 25;
        float expPrice = 10.00f;
        //Shirt 2
        int expId2 = 2;
        String expShirtType2 = "Rain coat";
        String expBrand2 = "AE";
        String expMaterial2 = "Plastic";
        int expQuantity2 = 5;
        float expPrice2 = 60.00f;
        //2
        ShirtService newShirtService2 = new ShirtService();
        Shirt newButtonDown = newShirtService2.create(expShirtType, expBrand, expMaterial, expQuantity, expPrice);
        Shirt newRainCoat = newShirtService2.create(expShirtType2, expBrand2, expMaterial2, expQuantity2, expPrice2);
        //3
        Object[] actualShirtArray = new Shirt[2];
        actualShirtArray[0] = newButtonDown;
        actualShirtArray[1] = newRainCoat;
        //4
        Assertions.assertArrayEquals(actualShirtArray, newShirtService2.findAll());

    }

    @Test
    public void deleteShirtTest(){
        //1
        //Shirt 1
        int expId = 1;
        String expShirtType = "Button-Up";
        String expBrand = "Happy";
        String expMaterial = "Silk";
        int expQuantity = 10;
        float expPrice = 100.00f;
        //Shirt 2
        int expId2 = 2;
        String expShirtType2 = "Winter coat";
        String expBrand2 = "Panda";
        String expMaterial2 = "Feather";
        int expQuantity2 = 9;
        float expPrice2 = 160.00f;
        //2
        ShirtService newShirtService2 = new ShirtService();
        Shirt newButtonUp = newShirtService2.create(expShirtType, expBrand, expMaterial, expQuantity, expPrice);
        Shirt newWinterCoat = newShirtService2.create(expShirtType2, expBrand2, expMaterial2, expQuantity2, expPrice2);
        //3
        //Test 1
        boolean deleteResult = newShirtService2.delete(expId2);
        Assertions.assertTrue(deleteResult);

        //Test 2
        Assertions.assertFalse(newShirtService2.delete(expId2));


    }
}
