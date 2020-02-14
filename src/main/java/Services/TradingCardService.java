package Services;

import Models.Desserts;
import Models.TradingCards;
import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

public class TradingCardService {
    private static int nextId = 1;  // (1)


    private static ArrayList <TradingCards> inventory = new ArrayList<>();  // (2)

    public static TradingCards create(String game, int rarity, boolean isFromStartedDeck, double price) {

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
        for(int i=0; i<inventory.size(); i++){
            if(inventory.get(i).getId()==id){
                return inventory.get(i);
            }
        }
        return null;
    }

    //read all
    public TradingCards[] findAll() {
        // should return a basic array copy of the ArrayList
        TradingCards[] tcArr = new TradingCards[inventory.size()];
        for(int i=0; i<inventory.size(); i++){
            tcArr[i] = inventory.get(i);
        }
        return tcArr;
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        if(findTradingCard(id) != null){
            inventory.remove(findTradingCard(id));
            return true;
        }else{
            return false;
        }
    }
}
