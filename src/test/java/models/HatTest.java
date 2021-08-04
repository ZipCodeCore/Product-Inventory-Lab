package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HatTest {

    @Test
    public void setHatIdTest() {
        //Given
        int expected = 503;

        // When
        Hat testHat = new Hat();
        testHat.setHatId(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getHatId());
    }

    @Test
    public void setTypeTest() {
        //Given
        String expected = "Fitted";

        // When
        Hat testHat = new Hat();
        testHat.setType(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getType());
    }

    @Test
    public void setSportTest() {
        //Given
        String expected = "Baseball";

        // When
        Hat testHat = new Hat();
        testHat.setSport(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getSport());
    }

    @Test
    public void setTeamTest() {
        //Given
        String expected = "Chicago White Sox";

        // When
        Hat testHat = new Hat();
        testHat.setTeam(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getTeam());
    }

    @Test
    public void setSizeTest() {
        //Given
        String expected = "Small";

        // When
        Hat testHat = new Hat();
        testHat.setSize(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getSize());
    }

    @Test
    public void setQuantityTest() {
        //Given
        int expected = 20;

        // When
        Hat testHat = new Hat();
        testHat.setQuantity(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getQuantity());
    }

    @Test
    public void setPriceTest() {
        //Given
        float expected = 39.99F;

        // When
        Hat testHat = new Hat();
        testHat.setPrice(expected);

        // Then
        Assertions.assertEquals(expected, testHat.getPrice());
    }

    @Test
    public void constructorTest() {
        // Given
        int expectedId = 302;
        String expectedType = "Fitted";
        String expectedSport = "Baseball";
        String expectedTeam = "New York Yankees";
        String expectedSize = "Small";
        int expectedQuantity = 20;
        float expectedPrice = 40.00F;

        // When
        Hat testHat = new Hat(expectedId, expectedType, expectedSport,
                expectedTeam, expectedSize, expectedQuantity, expectedPrice);

        // Then
        Assertions.assertEquals(expectedId, testHat.getHatId());
        Assertions.assertEquals(expectedType, testHat.getType());
        Assertions.assertEquals(expectedSport, testHat.getSport());
        Assertions.assertEquals(expectedTeam, testHat.getTeam());
        Assertions.assertEquals(expectedSize, testHat.getSize());
        Assertions.assertEquals(expectedQuantity, testHat.getQuantity());
        Assertions.assertEquals(expectedPrice, testHat.getPrice());

    }


}
