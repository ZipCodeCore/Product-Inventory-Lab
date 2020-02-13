package Models;

public class TradingCards {
    private  String game;
    private int rarity;
    boolean isFromStartedDeck;
    private int price;

    public void setGame(String game) {
        this.game = game;
    }
    public String getGame() {
        return game;
    }
    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
    public int getRarity() {
        return rarity;
    }
}
