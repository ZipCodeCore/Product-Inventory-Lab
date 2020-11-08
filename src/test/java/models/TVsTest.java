package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TVsTest {
    @Test
    public void setNameTest() {
        // given
        TVs tvs = new TVs();      //
        String expected = "Samsung";

        //when
        TVs testName = new TVs();
       testName.setName(expected);

        //then
        Assertions.assertEquals(expected, testName.getName());
    }

    @Test
    public void setQuantityTest() {
        //given
        int expected = 500;

        //when
        TVs testQuantity = new TVs();
        testQuantity.setQuantity(expected);

        //then
        Assertions.assertEquals(expected, testQuantity.getQuantity());
    }

    @Test
    public void setPriceTest() {
        //given
        double expected =  29.99;

        //when
        TVs testPrice = new TVs();
        testPrice.setPrice((double) expected);

        //then
        Assertions.assertEquals(expected, testPrice.getPrice());

    }
    //d. need this for constructor
    @Test
    public void testDefaultConstructorTV() {
        //Given
        String expectedName = "Samsung";
        int expectedQuantity = 500;
        double expectedPrice = 29.99;

        //When
        TVs tvs = new TVs(expectedName, expectedQuantity, expectedPrice);

        //Then
        String actualName = tvs.getName();
        int actualQuantity = tvs.getQuantity();
        double actualPrice = tvs.getPrice();

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }




    }

