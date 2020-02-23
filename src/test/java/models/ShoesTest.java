package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoesTest {

    @Test
    public void setNameTest() {
        // given (1)
        Shoes shoe = new Shoes();
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
        double expected = 20.99;

        //when
        Shoes testPrice = new Shoes();
        testPrice.setPrice(expected);

        //then
        Assertions.assertEquals(expected, testPrice.getPrice());

    }
    //d.
    @Test
    public void testDefaultConstructor() {
        //Given
        String expectedName = "NIKE";
        int expectedQuantity = 1000;
        double expectedPrice = 20.99;

        //When
        Shoes shoes = new Shoes(expectedName, expectedQuantity, expectedPrice);

        //Then
        String actualName = shoes.getName();
        int actualQuantity = shoes.getQuantity();
        double actualPrice = shoes.getPrice();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }



}



