package com.gucio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {

        List<Laptop> laptopsList = new ArrayList<>();

        laptopsList.add(new Laptop("asus", -3));
        laptopsList.add(new Laptop("hp", 45));
        laptopsList.add(new Laptop("toshiba", 15));
        laptopsList.add(new Laptop("acer", 10));


    }
}
