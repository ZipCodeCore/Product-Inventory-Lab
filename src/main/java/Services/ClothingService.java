package Services;

import Models.Clothing;

import java.util.ArrayList;

public class ClothingService {

    private static int nextId=1;
    private ArrayList<Clothing> inventory = new ArrayList<>();



public Clothing create(String name,String brand,int size,int quantity,float price){

    Clothing createdClothing = new Clothing(nextId++,name,brand,size,quantity,price);

    inventory.add(createdClothing);

    return createdClothing;
}

public Clothing findClothing(int id) {
    for (Clothing findObject : inventory) {
        if (findObject.getId() == id) {
            return findObject;
        }
    } return null;
}

public Clothing[] findAll(){
    ArrayList<Clothing> inventoryClone =(ArrayList<Clothing>) inventory.clone();
    return (Clothing[]) inventoryClone.toArray();
}
public boolean delete(int id){
for(Clothing deleteObject : inventory){
    if(deleteObject.getId()==id){
        return true;
    }
}
return false;
}
}
