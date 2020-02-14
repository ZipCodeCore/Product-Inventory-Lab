package Services;

import Models.Desserts;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DessertsServiceTest {
    DessertsService ds1;
    Desserts des1;
    Desserts des2;
    Desserts des3;

    @Before
    public void setUp(){
        ds1 = new DessertsService();

        des1 = ds1.create(
                "brownie",
                2.00,
                6,
                1);


        des2 = ds1.create(
                "crepe",
                9.00,
                8,
                2);


        des3 = ds1.create(
                "sundae",
                4.00,
                10,
                3);


    }




    @Test // (1)
    public void createTest(){

        String exname = "icecream";
        double exprice = 4.00;
        int expopularity = 3;
        int exnumServes = 2;

        DessertsService dService = new DessertsService();
        Desserts testDessert = DessertsService.create(exname, exprice, expopularity,
                exnumServes);

        int actualId = testDessert.getId();
        String actualname = testDessert.getName();
        double actualprice = testDessert.getPrice();
        int actualpopularity = testDessert.getpopularity();
        int actualnumServes = testDessert.getnumServes();




        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(exname, actualname);
        Assertions.assertEquals(exprice, actualprice);
        Assertions.assertEquals(expopularity, actualpopularity);
        Assertions.assertEquals(exnumServes, actualnumServes);

    }

}
