package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;
    private ArrayList<Sneaker> inventory=new ArrayList<>();
public  Sneaker create(String name, String brand, String sport, float size, int quantity, float price){
    Sneaker sneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
    inventory.add(sneaker);
    return sneaker;
}
}
