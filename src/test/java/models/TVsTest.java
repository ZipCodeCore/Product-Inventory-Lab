package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TVsTest {
    @Test
    public void setNameTest() {
        // given
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
        int expected = (int) 29.99;

        //when
        TVs testPrice = new TVs();
        testPrice.setPrice((double) expected);

        //then
        Assertions.assertEquals(expected, testPrice.getPrice());

    }




    }

