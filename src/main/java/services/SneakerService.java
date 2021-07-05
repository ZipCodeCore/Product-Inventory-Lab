package services;

import com.sun.deploy.net.MessageHeader;
import models.Sneaker;
import utils.CSVUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;  // (1)
    private static ArrayList<Sneaker> inventory = new ArrayList<>();
    public  Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }
    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        for(Sneaker element : inventory){
            if(element.getId() == id){
                return element;
            }
        }
        return null;
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new Sneaker[0]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exists and return true.
        // Otherwise return false
        for(Sneaker element: inventory){
            if(element.getId() == id){
                inventory.remove(element);
                return true;
            }
        }
        return false;
    }

    public static void csvFileSaver() throws IOException {
        String csvFile = "/Users/zach/Desktop/Sneaker.csv";
        FileWriter writer = new FileWriter(csvFile);

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

        for (Sneaker s : inventory) {
            List<String> list = new ArrayList<>();
            list.add(String.valueOf(s.getId()));
            list.add(s.getName());
            list.add(s.getBrand());
            list.add(s.getSport());
            list.add(String.valueOf(s.getSize()));
            list.add(String.valueOf(s.getQty()));
            list.add(String.valueOf(s.getPrice()));

            CSVUtils.writeLine(writer, list);
        }


        writer.flush();
        writer.close();
    }

    public static void loadData(){
        // (1)
        String csvFile = "/Users/zach/Desktop/Sneaker.csv";
        String line = "";
        String csvSplitBy = ",";

        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());  // (3)

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                // (4)
                int id = Integer.parseInt(beer[0]);
                String name = beer[1];
                String brand = beer[2];
                String sport = beer[3];
                float size = Float.parseFloat(beer[4]);
                int qty = Integer.parseInt(beer[5]);
                float price = Float.parseFloat(beer[6]);

                // (5)
                inventory.add(new Sneaker(id, name, brand, sport, size, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
