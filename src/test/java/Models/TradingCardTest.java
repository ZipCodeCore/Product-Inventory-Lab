package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TradingCardTest {
    @Test
    public void setGameTest() {
        String expected = "pokemon";
        TradingCards testGame = new TradingCards();
        testGame.setGame(expected);
        Assertions.assertEquals(expected, testGame.getGame());
    }

    @Test // (1)
    public void constructorTest(){
        int exid = 5;
          String exgame = "DnD";
         int exrarity = 6;
         boolean exisFromStartedDeck = false;
         double exprice = 15.00;

        TradingCards testCard = new TradingCards(exid, exgame, exrarity, exisFromStartedDeck,
                exprice);

        Assertions.assertEquals(exid, testCard.getId());
        Assertions.assertEquals(exgame, testCard.getGame());
        Assertions.assertEquals(exrarity, testCard.getRarity());
        Assertions.assertEquals(exisFromStartedDeck, testCard.getFromStarterDeck());
        Assertions.assertEquals(exprice, testCard.getPrice());

    }
}

