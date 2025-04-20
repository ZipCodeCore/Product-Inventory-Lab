package Models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
@Test
public void testSetName(){
        //given
        String expectedBrand="Munch";
        //when
        Chocolate chocolate=new Chocolate();
        chocolate.setBrand(expectedBrand);
        //then
        Assertions.assertEquals(expectedBrand,chocolate.getBrand());
}

@Test
    public void testConstructor(){
        //given
     String expectedBrand="Munch";
     String type="Wafer";
     int quantity=10;
     float price=5;

     //when
    Chocolate chocolate=new Chocolate();

    //then
    Assertions.assertEquals(expectedBrand,chocolate.getBrand());
    Assertions.assertEquals(type,chocolate.getType());
    Assertions.assertEquals(quantity,chocolate.getQuantity());
    Assertions.assertEquals(price,chocolate.getPrice());
}

}