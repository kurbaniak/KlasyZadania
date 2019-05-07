package com.gucio;

public class Alkohol {
    private String name;
    private float vol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
    }

    public float calculatePerMill(int quantity, int weight, boolean male) {
        float k;
        if (male) {
            k = 0.7f;
        } else {
            k = 0.6f;
        }
        return (0.789f * (quantity * getVol()) / (weight * k));
    }

    public Alkohol(String name, float vol) {
        this.name = name;
        this.vol = vol;
    }
}
