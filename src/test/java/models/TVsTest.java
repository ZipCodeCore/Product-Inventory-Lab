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
}
