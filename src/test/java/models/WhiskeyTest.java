package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {
    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Occifer";
        String expectedBrand = "GitLit Inc";
        int expectedQty = 10;
        float expectedSize = 48.00f;
        int expectedProof = 40;
        float expectedPrice = 80.00f;

        // (3)
        Whiskey testWhiskey = new Whiskey(expectedId, expectedName, expectedBrand,
                 expectedProof, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testWhiskey.getId());
        Assertions.assertEquals(expectedName, testWhiskey.getName());
        Assertions.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assertions.assertEquals(expectedProof, testWhiskey.getProof());
        Assertions.assertEquals(expectedQty, testWhiskey.getQty());
        Assertions.assertEquals(expectedPrice, testWhiskey.getPrice());
    }
}
