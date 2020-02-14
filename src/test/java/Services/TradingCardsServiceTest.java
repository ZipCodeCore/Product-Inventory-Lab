package Services;

import Models.Desserts;
import Models.TradingCards;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TradingCardsServiceTest {
    TradingCardService tcs1;
    TradingCards tc1;
    TradingCards tc2;
    TradingCards tc3;

    @Before
    public void setUp(){
        tcs1 = new TradingCardService();

        tc1 = tcs1.create(
                "pokemon",
                6,
                false,
                12.00);


        tc2 = tcs1.create(
                "magic",
                2,
                true,
                4.00);


        tc3 = tcs1.create(
                "yu-gi-oh!",
                9,
                false,
                30.00);


    }


    @Test // (1)
    public void createTest(){
        String exgame = "DnD";
        int exrarity = 6;
        boolean exisFromStartedDeck = false;
        double exprice = 15.00;

        TradingCardService tcService = new TradingCardService();
        TradingCards testCard = TradingCardService.create(exgame, exrarity, exisFromStartedDeck,
                exprice);

        int actualId = testCard.getId();
        String actualgame = testCard.getGame();
        int actualrarity = testCard.getRarity();
        boolean actualisFromStartedDeck = testCard.getFromStarterDeck();
        double actualprice = testCard.getPrice();




        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(exgame, actualgame);
        Assertions.assertEquals(exrarity, actualrarity);
        Assertions.assertEquals(exisFromStartedDeck, actualisFromStartedDeck);
        Assertions.assertEquals(exprice, actualprice);

    }

}
