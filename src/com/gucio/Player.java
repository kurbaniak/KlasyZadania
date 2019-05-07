package com.gucio;

public class Player {

    private String name;
    private String username;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Player(String name, String username) {
        this.name = name;
        this.username = username;
        points = 0;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return name + "; username= " + username + "; p. " + points;
    }


}
