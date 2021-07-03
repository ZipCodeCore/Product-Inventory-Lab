package Services;

import Models.Clothing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothingServiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void createTest(){
        //int expectedId=112;
        String expectedName ="Jean";
        String expectedBrand="Levis";
        int expectedSize=6;
        int expectedQuantity=10;
        float expectedPrice=35;

        ClothingService clothingService = new ClothingService();
        Clothing testClothing = clothingService.create(expectedName,expectedBrand,expectedSize,expectedQuantity,expectedPrice);

        int actualId = testClothing.getId();
        String actualName = testClothing.getName();;
        String actualBrand = testClothing.getBrand();;
        int actualSize = testClothing.getSize();
        int actualQuantity = testClothing.getQuantity();
        float actualPrice = testClothing.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }
}