package Models;

public class TradingCards {
    private int id;
    private  String game;
    private int rarity;
    private boolean isFromStartedDeck;
    private double price;

    public TradingCards(int id, String game, int rarity, boolean isFromStartedDeck, double price){
        this.id = id;
        this.game = game;
        this.rarity = rarity;
        this.isFromStartedDeck = isFromStartedDeck;
        this.price = price;
    }


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
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

    public void setFromStarterDeck(boolean isFromStartedDeck) {
        this.isFromStartedDeck = isFromStartedDeck;
    }
    public boolean getFromStarterDeck() {
        return isFromStartedDeck;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
