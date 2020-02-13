package Services;

import Models.Desserts;
import Models.TradingCards;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DessertsServiceTest {
    @Test // (1)
    public void createTest(){
        int exid = 6;
        String exname = "icecream";
        double exprice = 4.00;
        boolean exservedCold = true;
        boolean excurrentlyOnMenu = false;

        DessertsService dService = new DessertsService();
        Desserts testDessert = TradingCardService.create(exid, exname, exprice, exservedCold,
                excurrentlyOnMenu);

        int actualId = testDessert.getId();
        String actualname = testDessert.getName();
        double actualprice = testDessert.getPrice();
        boolean actualservedCold = testDessert.getServedCold();
        boolean actualcurrentlyOnMenu = testDessert.getcurrentlyOnMenu();




        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(exname, actualname);
        Assertions.assertEquals(exprice, actualprice);
        Assertions.assertEquals(exservedCold, actualservedCold);
        Assertions.assertEquals(excurrentlyOnMenu, actualcurrentlyOnMenu);

    }
}
