package services;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import jdk.internal.org.objectweb.asm.TypeReference;
import models.Sneaker;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SneakerService {
    //Generate an int ID for the each sneaker
    public static int nextID = 1;
    //Create an inventory arrayList for sneakers
    private static ArrayList<Sneaker> inventory = new ArrayList<>();

    //Creates a new sneaker object and add it to the inventory.
    public Sneaker create(String name, String brand, String sport, int qty, float price) {
        //2
        Sneaker createdSneaker = new Sneaker(nextID++, name, brand, sport, qty, price);
        //3
        inventory.add(createdSneaker);
        //4
        return createdSneaker;

    }

    //Finds a particular sneaker object in inventory using a provided id.
    public Object find(int id) {
        for(Sneaker sneaker : inventory) {
            if(sneaker.getId() == id){
                return sneaker;
            }
        }
        return null;
    }

    public Sneaker[] findAll() {
        return inventory.toArray(new Sneaker[0]);
    }

    public boolean delete(int id) {
        for(Sneaker sneaker: inventory) {
            if(sneaker.getId() == id){
                inventory.remove(sneaker);
                return true;
            }
        }
        return false;
    }

    public static void makeCSVfile() throws IOException {
        String csvFile = "/Users/nathan/Desktop/Sneaker.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextID))));  // (2)

        for (Sneaker s : inventory) {
            List<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(s.getId()));
            list.add(s.getName());
            list.add(s.getBrand());
            list.add(s.getSport());
            list.add(String.valueOf(s.getQuantity()));
            list.add(String.valueOf(s.getPrice()));

            CSVUtils.writeLine(writer, list);  // (4)
        }

        // (5)
        writer.flush();
        writer.close();
    }

    public static void loadData(){
        // (1)
        String csvFile = "/Users/nathan/Desktop/Sneaker.csv";
        String line = "";
        String csvSplitBy = ",";

        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextID = Integer.parseInt(br.readLine());  // (3)

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                // (4)
                int id = Integer.parseInt(beer[0]);
                String name = beer[1];
                String brand = beer[2];
                String sport = beer[3];
                int qty = Integer.parseInt(beer[4]);
                float price = Float.parseFloat(beer[5]);

                // (5)
                inventory.add(new Sneaker(id, name, brand, sport, qty, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readInJSON(){
        ObjectMapper objectMapper = new ObjectMapper();
        inventory = objectMapper.readValue(new File("sneaker.json"), new TypeReference<List<Sneaker>>(){});
    }

    public void writeInJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("sneaker.json"), inventory);
    }


}
