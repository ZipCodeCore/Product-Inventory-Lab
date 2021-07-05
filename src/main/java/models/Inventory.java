package models;

import services.SneakerService;
import services.WhiskeyService;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory {
    private SneakerService sneakerService = new SneakerService();
    private WhiskeyService whiskeyService = new WhiskeyService();
/*Method to return the total number of Sneakers in Inventory
Method to return the total number of Whiskeys in Inventory
Method to return the sum of both
Method to return total $ amount of Sneakers, total $ amount of Whiskey, and the overall total
*/
    public SneakerService getSneakerService(){
        return this.sneakerService;
    }

    public WhiskeyService getWhiskeyService(){
        return this.whiskeyService;
    }
    public Integer sneakersInStock(){
        Sneaker[] allSneakers = this.sneakerService.findAll();
        Integer count = 0;

        for(Sneaker element: allSneakers){
            count += element.getQty();
        }
        return count;
    }

    public Integer whiskeyInStock(){
        Whiskey[] allWhiskey = this.whiskeyService.findAll();
        Integer count = 0;

        for(Whiskey element: allWhiskey){
            count += element.getQty();
        }
        return count;
    }

    public Integer totalItemsInStock(){
        return this.sneakersInStock() + this.whiskeyInStock();
    }

    public Float totalSneakersValue(){
        Sneaker[] allSneakers = this.sneakerService.findAll();
        Float totalValue = 0.00f;
        for(Sneaker element: allSneakers){
            totalValue += element.getPrice() * element.getQty();
        }

        return totalValue;
    }

    public Float totalWhiskeyValue(){
        Whiskey[] allWhiskey = this.whiskeyService.findAll();
        Float totalValue = 0.00f;
        for(Whiskey element: allWhiskey){
            totalValue += element.getPrice() * element.getQty();
        }

        return totalValue;
    }

    public Float totalInventoryValue(){
        return totalSneakersValue() + totalWhiskeyValue();
    }

    public Product[] getAllProductsArrayList(){
        ArrayList<Product> masterList = new ArrayList<>();
        Sneaker[] sneakerList = sneakerService.findAll();
        Whiskey[] whiskeyList = whiskeyService.findAll();

        for(Product element: sneakerList)
            masterList.add(element);

        for(Product element: whiskeyList)
            masterList.add(element);

        return masterList.toArray(new Product[0]);
    }
}
