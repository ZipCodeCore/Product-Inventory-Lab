package services;

import models.Sneaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SneakerService<nextId> {

        private static int nextId = 1;  // (1)
        private static List<Sneaker> inventory = new ArrayList<>(); // (2)

        public static Sneaker create(String name, String brand, String sport, int size, int quantity, float price) {
                Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
                inventory.add(createdSneaker);
                return createdSneaker;

        }

        //read
        public Sneaker findSneaker(int id) {
                for (Sneaker item : inventory) {
                        if (item.getId() == id) {
                                return item;             // should take an int and return an object with that id, if exists
                        }
                }
                return null;
        }


        //read all
        public Sneaker[] findAll() {
             return inventory.toArray(new Sneaker[0]);          // should return a basic array copy of the ArrayList
        }

        //delete
        public boolean delete(int id) {
            for(Sneaker item : inventory){
                    if(item.getId() == id) {
                            inventory.remove(item);
                            return true;                // should remove the object with this id from the ArrayList if exits and return true.
                    }

            }
              return false;                                          // Otherwise return false
        }
public static  void csvFileSaver() throws IOException{
        String csvFile = "/Users/john/Desktop/Sneaker.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

        for (Sneaker s : inventory) {
                List<String> list = new ArrayList<>(); // (3)
                list.add(String.valueOf(s.getId()));
                list.add(s.getName());
                list.add(s.getBrand());
                list.add(s.getSport());
                list.add(String.valueOf(s.getQty()));
                list.add(String.valueOf(s.getPrice()));

                CSVUtils.writeLine(writer, (ArrayList<String>) list);  // (4)
        }

// (5)
        writer.flush();
        writer.close();

}
        private void loadData(){
                // (1)
                String csvFile = "/Users/John/Desktop/Sneaker.csv";
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
                                int qty = Integer.parseInt(beer[4]);
                                float price = Float.parseFloat(beer[5]);

                                // (5)
                                inventory.add(new Sneaker(id, name, brand, sport, qty, price));
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

}
