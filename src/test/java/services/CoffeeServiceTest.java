package services;


import models.Coffee;
import org.junit.Assert;
import org.junit.Test;

public class CoffeeServiceTest {
    @Test
    public void serviceUnitIdTest () {
        Integer expectedUnitId = 4;
        Integer expectedAmountInStock = 499;
        String expectedBrand = "Maxwell";
        String expectedFlavor = "Light Roast";
        Double expectedPrice = 19.99;
        Double expectedWeight = 16.0;

        CoffeeService coffeeService = new CoffeeService();
        Coffee testCoffee = coffeeService.create(expectedUnitId, expectedAmountInStock, expectedBrand, expectedFlavor
                , expectedPrice, expectedWeight);

        Integer actualUnitId = testCoffee.getUnitId();
        Integer actualAmountInStock = testCoffee.getAmountInStock();
        String actualBrand = testCoffee.getBrand();
        String actualFlavor = testCoffee.getFlavor();
        Double actualPrice = testCoffee.getPrice();
        Double actualWeight = testCoffee.getWeight();

        Assert.assertEquals(Integer.class.getName(), new Integer(actualUnitId).getClass().getName());
        Assert.assertEquals(expectedAmountInStock, actualAmountInStock);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedFlavor, actualFlavor);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedWeight, actualWeight);
    }
}
