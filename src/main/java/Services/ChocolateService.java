package Services;

import Models.Chocolate;
import utils.CSVUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChocolateService {
    private static int nextId=1;
    private ArrayList<Chocolate> inventory = new ArrayList<>();



    public Chocolate create(String brand,String type,int quantity,float price){

        Chocolate createdChocolate = new Chocolate(nextId++,brand,type,quantity,price);

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
//        ArrayList<Chocolate> inventoryClone =(ArrayList<Chocolate>) inventory.clone();
//        return (Chocolate[]) inventoryClone.toArray();
        return inventory.toArray(new Chocolate[0]);
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

    public void writeCSVUtils() throws IOException {
        String csvFile = "/Users/batman/Desktop/Chocolate.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

        for (Chocolate s : inventory) {
            List<String> list = new ArrayList<>(); // (3)
           // list.add(String.valueOf(s.getId()));
            list.add(s.getBrand());
            list.add(s.getType());
            // list.add(s.getSport());
            list.add(String.valueOf(s.getQuantity()));
            list.add(String.valueOf(s.getPrice()));

            CSVUtils.writeLine(writer, list);  // (4)
        }
        writer.flush();
        writer.close();
    }

    private void loadData(){
        // (1)
        String csvFile = "/Users/batman/Desktop/Chocolate.csv";
        String line = "";
        String csvSplitBy = ",";

        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());  // (3)

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] candy = line.split(csvSplitBy);

                // (4)
                int id = Integer.parseInt(candy[0]);
                String type = candy[1];
                String brand = candy[2];
               // int quantity = candy[5];
                int quantity = Integer.parseInt(candy[3]);
                float price = Float.parseFloat(candy[4]);

                // (5)
                inventory.add(new Chocolate(id, type,brand, quantity, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
