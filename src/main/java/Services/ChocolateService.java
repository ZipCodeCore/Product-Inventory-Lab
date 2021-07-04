package Services;

import Models.Chocolate;

import java.util.ArrayList;

public class ChocolateService {
    private static int nextId=1;
    private ArrayList<Chocolate> inventory = new ArrayList<>();



    public Chocolate create(String brand,String type,int quantity,float price){

        Chocolate createdChocolate = new Chocolate(brand,type,quantity,price);

        inventory.add(createdChocolate);

        return createdChocolate;
    }

    public Chocolate findChocolate(String brand) {
        for (Chocolate findObject : inventory) {
            if (findObject.getBrand().equals(brand)) {
                return findObject;
            }
        } return null;
    }

    public Chocolate[] findAll(){
        ArrayList<Chocolate> inventoryClone =(ArrayList<Chocolate>) inventory.clone();
        return (Chocolate[]) inventoryClone.toArray();
    }

    public Boolean update(String brand,Integer quantity){
        for(Chocolate updateQuantity:inventory){
            if(updateQuantity.getBrand().equals(brand)){
                updateQuantity.setQuantity(quantity);
                return true;
            }
        }
        return false;
    }
    public boolean delete(String brand){
        for(Chocolate deleteObject : inventory){
            if(deleteObject.getBrand().equals(brand)){
                return true;
            }
        }
        return false;
    }
}
