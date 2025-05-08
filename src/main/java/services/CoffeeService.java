package services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import models.Coffee;
import utils.CSVUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeService {

    public static Integer nextUnitId = 1;
    public static ArrayList<Coffee> inventory = new ArrayList<>();

    public Coffee create(Integer unitId, Integer amountInStock, String brand, String flavor, Double price, Double weight) {

        Coffee createdCoffee = new Coffee(unitId++, amountInStock, brand, flavor, price, weight);

        inventory.add(createdCoffee);

        return createdCoffee;
    }

    public Coffee findCoffee(Integer unitId) {
        return inventory.get(unitId);
    }
    public Coffee[] findAll() {
        return inventory.toArray(new Coffee[0]);
    }
    public boolean delete(Integer unitId) {
        for(Coffee element: inventory){
            if(element.getUnitId() == unitId){
                inventory.remove(element);
                return true;
            }
        }
        return false;
    }


    public static void fileSaver () throws  IOException {


        String csvFile = "/Users/nick/Desktop/Coffee.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextUnitId))));  // (2)

        for (Coffee s : inventory) {
            List<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(s.getUnitId()));
            list.add(String.valueOf(s.getAmountInStock()));
            list.add(s.getBrand());
            list.add(s.getFlavor());
            list.add(String.valueOf(s.getPrice()));
            list.add(String.valueOf(s.getWeight()));

            CSVUtils.writeLine(writer, list);  // (4)
        }

// (5)
        writer.flush();      // nice
        writer.close();

        }


    public static void loadData() {

        String csvFile = "/Users/nick/Desktop/Coffee.csv";
        String line = "";
        String csvSplitBy = ",";



        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextUnitId = Integer.parseInt(br.readLine());

            while ((line = br.readLine()) != null) {

                String[] coffee = line.split(csvSplitBy);
                int nextUnitId = Integer.valueOf(coffee[0]);
                int amountInStock = Integer.valueOf(coffee[1]);
                String brand = coffee[2];
                String flavor = coffee[3];
                Double price = Double.valueOf(coffee[4]);
                Double weight = Double.valueOf(coffee[5]);

                inventory.add(new Coffee(nextUnitId, amountInStock, brand, flavor, price, weight));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writingJSON () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("sneaker.json"), inventory);
    }
    public static void readingJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        inventory = objectMapper.readValue(new File("sneaker.json"), new TypeReference<ArrayList<Coffee>>(){});
    }
}
