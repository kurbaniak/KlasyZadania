package Zadanie2Kwiaty;

public class Flower {
    private String name;
    private int height;
    private boolean fullBlown;
    private int distance;


    public void grow(){
        if (!fullBlown){
            if(distance<=5){
                height = height + (6-distance);
            }
        }
    }

    public Flower(String name, int height, boolean fullBlown, int distance) {
        this.name = name;
        this.height = height;
        this.fullBlown = fullBlown;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isFullBlown() {
        return fullBlown;
    }

    public void setFullBlown(boolean fullBlown) {
        this.fullBlown = fullBlown;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        String temp = name + " is " + distance + " ";
        temp = temp + "away and its height is " + height + " --> " + fullBlown;
        return temp;
    }
}
