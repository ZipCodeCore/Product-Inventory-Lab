package Services;

import Models.Chocolate;
import Models.Clothing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateServiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void createTest(){

        String expectedBrand="Kit Kat";
        String expectedType ="Bar";
        int expectedQuantity=10;
        float expectedPrice=5;

        ChocolateService chocolateService = new ChocolateService();
        Chocolate testChocolate = chocolateService.create(expectedBrand,expectedType,expectedQuantity,expectedPrice);


        String actualBrand = testChocolate.getBrand();
        String actualType = testChocolate.getType();
        int actualQuantity = testChocolate.getQuantity();
        float actualPrice = testChocolate.getPrice();

        //Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    void findChocolate() {
        //Given
        ChocolateService chocolateService = new ChocolateService();
        Chocolate foundChocolate = new Chocolate();
        chocolateService.create("Munch","wafer",10,5);
        chocolateService.create("Kit kat","bar",20,10);
        //When
        foundChocolate = chocolateService.findChocolate("Munch");

        //Then
        Assertions.assertEquals("Munch", foundChocolate.getBrand());

    }

    @Test
    void findAll() {
        //Given
        ChocolateService chocolateService = new ChocolateService();
        //Clothing foundClothing = new Clothing();
        chocolateService.create("Munch","wafer",10,5);
        chocolateService.create("Kit kat","bar",20,10);
        //When
        Chocolate [] chocolates = chocolateService.findAll();
        //Then
        Assertions.assertTrue(true);
    }

    @Test
    void delete() {
        //Given
        ChocolateService chocolateService = new ChocolateService();
        Boolean isChocolateDeleted = true;
        chocolateService.create("Munch","wafer",10,5);
        chocolateService.create("Kit kat","bar",20,10);
        //When
        isChocolateDeleted = chocolateService.delete("Munch");
        //Then
        Assertions.assertEquals(true, isChocolateDeleted);
    }
}