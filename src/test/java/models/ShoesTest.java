package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoesTest {

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "NIKE";

        // when (2)
        Shoes testName = new Shoes();
        testName.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testName.getName());
    }
    @Test
    public void setQuantityTest() {
        //given
        int expected = 1000;

        // when
        Shoes testQuantity = new Shoes();
        testQuantity.setQuantity(expected);

        // then
        Assertions.assertEquals(expected, testQuantity.getQuantity());


    }
    @Test
    public void setPrice() {
        //given
        Double expected = 20.99;

        //when
        Shoes testPrice = new Shoes();
        testPrice.setPrice(expected);

        //then
        Assertions.assertEquals(expected, testPrice.getPrice());


    }
}



