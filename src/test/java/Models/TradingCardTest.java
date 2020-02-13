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
    @Test
    public void setRarityTest() {
        int expected = 5;
        TradingCards testRarity = new TradingCards();
        testRarity.setRarity(expected);
        Assertions.assertEquals(expected, testRarity.getRarity());
    }
}
