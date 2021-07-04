package Services;

import Models.Chocolate;
import Models.Clothing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

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
        Chocolate chocolate = new Chocolate();
        chocolateService.create("Munch","wafer",10,5);
        chocolateService.create("Kit kat","bar",20,10);
        //When
        chocolate = chocolateService.findChocolate("Munch");

        //Then
        Assertions.assertEquals("Munch", chocolate.getBrand());

    }

    @Test
    void findAll() {
        //Given
        ChocolateService chocolateService = new ChocolateService();
        //Clothing foundClothing = new Clothing();
        chocolateService.create("Munch","wafer",10,5);
        chocolateService.create("Kit kat","bar",20,10);
        //When
        Chocolate[] chocolates = chocolateService.findAll();
        //Then
        Assertions.assertEquals(2,chocolates.length);
        //Assertions.assertTrue(true);
    }

    @Test
    void delete() {
        //Given
        ChocolateService chocolateService = new ChocolateService();
        Boolean chocolateDeleted = true;
        chocolateService.create("Munch","wafer",10,5);
        chocolateService.create("Kit kat","bar",20,10);
        //When
        chocolateDeleted = chocolateService.delete("Munch");
        //Then
        Assertions.assertEquals(true, chocolateDeleted);
    }

    @Test
    void update() {
    //given
        ChocolateService chocolateService=new ChocolateService();
        Boolean chocolateUpdated = true;
        chocolateService.create("cornetto","ice cream",5,5);

    //when
    chocolateUpdated=chocolateService.update("cornetto",10);

    //then
        Assertions.assertEquals(true,chocolateUpdated);
    }
}