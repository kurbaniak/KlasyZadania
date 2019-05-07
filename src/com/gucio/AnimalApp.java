package com.gucio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalApp {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();


        animalList.add(new Animal("small dog", "hau", false));
        animalList.add(new Animal("big dog", "hauuuuuuu", true));
        animalList.add(new Animal("cow", "muuuuuuuu", true));
        animalList.add(new Animal("cat", "miau", false));


        Random random = new Random();
        System.out.println("Loud animals");
        for (Animal animal:animalList){
            if (animal.isFlag()){
                System.out.print(animal.getName() + ": ");
                animal.speak(random.nextInt(5) + 1);
            }
        }

        System.out.println("Silent animal");
        for (Animal animal:animalList){
            if (!animal.isFlag()){
                System.out.print(animal.getName() + ": ");
                animal.speak(random.nextInt(5) + 1);
            }
        }
    }
    //todo rozbic zwierzeta na polimorfizm, czyli dodac klasy potomne
}
