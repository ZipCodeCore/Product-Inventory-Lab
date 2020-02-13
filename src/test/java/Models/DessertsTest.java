package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DessertsTest {
//    @Test
//    public void setNameTest() {
//        String expected = "brownie";
//        Desserts testDessert = new Desserts();
//        testDessert.setName(expected);
//        Assertions.assertEquals(expected, testDessert.getName());
//    }
//    @Test
//    public void setPriceTest() {
//        double expected = 3.00;
//        Desserts testDessert = new Desserts();
//        testDessert.setPrice(expected);
//        Assertions.assertEquals(expected, testDessert.getPrice());
//    }
@Test // (1)
public void constructorTest(){
    String exname = "icecream";
    double exprice = 4.00;
    boolean exservedCold = true;
    boolean excurrentlyOnMenu = false;

    Desserts testDessert = new Desserts(exname, exprice, exservedCold,
            excurrentlyOnMenu);


    Assertions.assertEquals(exname, testDessert.getName());
    Assertions.assertEquals(exprice, testDessert.getPrice());
    Assertions.assertEquals(exservedCold, testDessert.getServedCold());
    Assertions.assertEquals(excurrentlyOnMenu, testDessert.getcurrentlyOnMenu());

}
}
