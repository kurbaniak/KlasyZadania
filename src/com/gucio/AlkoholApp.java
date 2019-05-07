package com.gucio;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlkoholApp {

    public static void main(String[] args) {


        List<Alkohol> alcohols = new ArrayList<>();

        alcohols.add(new Alkohol("Beer", 0.05f));
        alcohols.add(new Alkohol("Vodka", 0.4f));
        alcohols.add(new Alkohol("Wine", 0.14f));
        alcohols.add(new Alkohol("Hooch", 0.7f));

        int waga;
        int ilosc = 100;
        Random random = new Random();

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(2);


        for (Alkohol alkohol:alcohols) {
            waga = random.nextInt(50) + 51;
            float promils = alkohol.calculatePerMill(ilosc,waga,true);
            System.out.println("Man (" + waga + "kg) will have "
            + decimalFormat.format(promils) + "%% + blood-alcohole content after drinking " + ilosc + "ml of " + alkohol.getName());
        }
    }
    // todo za kazda iteracja petli for each losuj cięzar człowieka ( random)
}