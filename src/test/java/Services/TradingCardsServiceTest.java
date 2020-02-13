package Services;

import Models.TradingCards;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TradingCardsServiceTest {
    @Test // (1)
    public void createTest(){
        int exid = 5;
        String exgame = "DnD";
        int exrarity = 6;
        boolean exisFromStartedDeck = false;
        double exprice = 15.00;

        TradingCardService tcService = new TradingCardService();
        TradingCards testCard = TradingCardService.create(exid, exgame, exrarity, exisFromStartedDeck,
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
