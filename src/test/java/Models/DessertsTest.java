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

@Test // (1)
public void constructorTest(){
    int exid = 6;
    String exname = "icecream";
    double exprice = 4.00;
    int expopularity = 9;
    int exnumServes = 2;

    Desserts testDessert = new Desserts(exid, exname, exprice, expopularity,
            exnumServes);

    Assertions.assertEquals(exid, testDessert.getId());
    Assertions.assertEquals(exname, testDessert.getName());
    Assertions.assertEquals(exprice, testDessert.getPrice());
    Assertions.assertEquals(expopularity, testDessert.getpopularity());
    Assertions.assertEquals(exnumServes, testDessert.getnumServes());

}
}
