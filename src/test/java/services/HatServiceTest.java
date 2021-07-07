package services;


import models.Hat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HatServiceTest {
    @Test
    public void createTest() {
        // Given
        String expectedType = "Fitted";
        String expectedSport = "Baseball";
        String expectedTeam = "New York Yankees";
        String expectedSize = "Small";
        int expectedQuantity = 20;
        float expectedPrice = 40.00F;

        // When
        HatService hatService = new HatService();
        Hat testHat = HatService.create(expectedType, expectedSport, expectedTeam,
                expectedSize, expectedQuantity, expectedPrice);

        int actualId = testHat.getHatId();
        String actualType = testHat.getType();
        String actualSport = testHat.getSport();
        String actualTeam = testHat.getTeam();
        String actualSize = testHat.getSize();
        int actualQuantity = testHat.getQuantity();
        float actualPrice = testHat.getPrice();

        // Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedTeam, actualTeam);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findHatTest() {
        // Given
        String expectedType = "Fitted";
        String expectedSport = "Baseball";
        String expectedTeam = "New York Yankees";
        String expectedSize = "Small";
        int expectedQuantity = 20;
        float expectedPrice = 40.00F;

        // When
        HatService hatService = new HatService();
        Hat testHat = HatService.create(expectedType, expectedSport, expectedTeam,
                expectedSize, expectedQuantity, expectedPrice);

        Hat actual = hatService.findHat(testHat.getHatId());

        Assertions.assertEquals(testHat, actual);
    }
}
