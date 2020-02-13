package Services;

import Models.TradingCards;

import java.util.ArrayList;

public class TradingCardService {
    private static int nextId = 1;  // (1)

    private arrList <TradingCards> inventory = new ArrayList<TradingCards>();  // (2)

    public TradingCards create(String game, int rarity, boolean isFromStartedDeck, double price) {

        // (2)
        TradingCards createdTradingCard = new TradingCards(nextId++, game, rarity, isFromStartedDeck, price);

        // (3)
        inventory.add(createdTradingCard);

        // (4)
        return createdTradingCard;
    }
    //read
    public TradingCards findTradingCard(int id) {
        // should take an int and return an object with that id, if exists
    }

    //read all
    public TradingCards[] findAll() {
        // should return a basic array copy of the ArrayList
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
    }
}
