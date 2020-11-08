package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerServices {

    private static int nextId = 1;  // (1)

    private List<Sneaker> inventory = new ArrayList<>();  // (2)
}
