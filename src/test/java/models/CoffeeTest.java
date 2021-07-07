package models;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CoffeeTest {


    @Test
    public void constructorTest () {
        //Given
        Integer expectedUnitId = 203;
        Integer expectedAmountInStock = 1000;
        String expectedBrand = "Maxwell";
        String expectedFlavor = "Dark Roast";
        Double expectedPrice = 16.00;
        Double expectedWeight = 12.0;
        //When
        Coffee testCoffee = new Coffee(expectedUnitId, expectedAmountInStock, expectedBrand, expectedFlavor
                , expectedPrice, expectedWeight);
    }

    @Test
    public void getUnitIdTest () {
        // given
        Integer expectedUnitId = 100;

        // when
        Coffee coffee = new Coffee(expectedUnitId, null, null   , null
        , null  , null  );
        coffee.setUnitId(expectedUnitId);
        Integer actual = coffee.getUnitId();

        // then
        Assert.assertEquals(expectedUnitId, actual);
    }

    @Test
    public void setUnitIdTest () {
        // given
        Integer expectedUnitId = 100;

        // when
        Coffee coffee = new Coffee(expectedUnitId, null, null   , null
                , null  , null  );
        coffee.setUnitId(expectedUnitId);
        Integer actual = coffee.getUnitId();

        // then
        Assert.assertEquals(expectedUnitId, actual);
    }

    @Test
    public void getAmountInStock () {
        // given
        Integer expectedAmount = 1000;
        // when
        Coffee coffee = new Coffee(null, expectedAmount, null   , null
                , null  , null  );
        coffee.setAmountInStock(expectedAmount);
        Integer actual = coffee.getAmountInStock();
        // then
        Assert.assertEquals(expectedAmount, actual);
    }

    @Test
    public void setAmountInStock () {
        // given
        Integer expectedAmount = 1000;
        // when
        Coffee coffee = new Coffee(null, expectedAmount, null   , null
                , null  , null  );
        coffee.setAmountInStock(expectedAmount);
        Integer actual = coffee.getAmountInStock();
        // then
        Assert.assertEquals(expectedAmount, actual);
    }

    @Test
    public void getBrandTest () {
        String expectedBrand = "Folgers";
        Coffee coffee = new Coffee(null, null, expectedBrand  , null
                , null  , null  );
        coffee.setBrand(expectedBrand);
        String actual = coffee.getBrand();
        Assert.assertEquals(expectedBrand, actual);
    }

    @Test
    public void setBrandTest () {
        String expectedBrand = "Folgers";
        Coffee coffee = new Coffee(null, null, expectedBrand  , null
                , null  , null  );
        coffee.setBrand(expectedBrand);
        String actual = coffee.getBrand();
        Assert.assertEquals(expectedBrand, actual);
    }

    @Test
    public void getFlavorTest () {
        String expectedFlavor = "Dark Roast";
        Coffee coffee = new Coffee(null, null, null, expectedFlavor
                , null  , null  );
        coffee.setFlavor(expectedFlavor);
        String actual = coffee.getFlavor();
        Assert.assertEquals(expectedFlavor, actual);
    }

    @Test
    public void setFlavorTest () {
        String expectedFlavor = "Dark Roast";
        Coffee coffee = new Coffee(null, null, null, expectedFlavor
                , null  , null  );
        coffee.setFlavor(expectedFlavor);
        String actual = coffee.getFlavor();
        Assert.assertEquals(expectedFlavor, actual);
    }

    @Test
    public void setPriceTest () {
        Double expectedPrice = 10.00;
        Coffee coffee = new Coffee(null, null, null, null
                , expectedPrice  , null  );
        coffee.setPrice(expectedPrice);
        Double actual = coffee.getPrice();
        Assert.assertEquals(expectedPrice, actual);
    }

    @Test
    public void getPriceTest () {
        Double expectedPrice = 10.00;
        Coffee coffee = new Coffee(null, null, null, null
                , expectedPrice  , null  );
        coffee.setPrice(expectedPrice);
        Double actual = coffee.getPrice();
        Assert.assertEquals(expectedPrice, actual);
    }

    @Test
    public void setWeightTest () {
        Double expectedWeight = 16.0;
        Coffee coffee = new Coffee(null, null, null, null
                , null , expectedWeight );
        coffee.setWeight(expectedWeight);
        Double actual = coffee.getWeight();
        Assert.assertEquals(expectedWeight, actual);
    }

    @Test
    public void getWeightTest () {
        Double expectedWeight = 16.0;
        Coffee coffee = new Coffee(null, null, null, null
                , null , expectedWeight );
        coffee.setWeight(expectedWeight);
        Double actual = coffee.getWeight();
        Assert.assertEquals(expectedWeight, actual);
    }
}