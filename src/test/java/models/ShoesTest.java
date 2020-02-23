package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoesTest {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Shoes shoes = new Shoes();
        Shoes.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, Shoes.getName());
    }
}
}
