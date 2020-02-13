package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DessertsTest {
    @Test
    public void setNameTest() {
        String expected = "brownie";
        Desserts testDessert = new Desserts();
        testDessert.setName(expected);
        Assertions.assertEquals(expected, testDessert.getName());
    }
    @Test
    public void setPriceTest() {
        double expected = 3.00;
        Desserts testDessert = new Desserts();
        testDessert.setPrice(expected);
        Assertions.assertEquals(expected, testDessert.getPrice());
    }
}
