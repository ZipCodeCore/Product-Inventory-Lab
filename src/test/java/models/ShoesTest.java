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
}



