package com.gucio;

import java.sql.SQLOutput;

public class Laptop {

    private String name;

    private int points;

    public Laptop(String name, int points) {
        if (points>0) {
            this.name = name;
            this.points = points;
        }else{
            System.out.println("Laptop "+name + " coud not be created." );
        }

    }

public void sortLaptop(){

}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void introduce() {
        System.out.print("Hi, I'm " + getName() + ", and I'm a ");
        if (getPoints() >= 0 && getPoints() <= 9) {
            System.out.println("very slow laptop.");
        } else if (getPoints() >= 10 && getPoints() <= 24) {
            System.out.println("quite decent laptop.");
        } else if (getPoints() >= 25 && getPoints() <= 50) {
            System.out.println("gaming machine.");

        }
    }
//todo dodac sortowanie laptopow po grade
    //todo blokowanie tworzenia obiektu poprzez wyjatek

}
