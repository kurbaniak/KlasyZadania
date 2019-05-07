package com.gucio;

import java.util.Collections;

public class Animal {

    private String name;
    private String voice;
    private boolean flag;

    public void speak(int times){
        String temp = String.join(" ", Collections.nCopies(times,voice));

        if (flag){
            temp = temp.toUpperCase();
        }else{
            temp = temp.toLowerCase();
        }
        System.out.println(temp);

    }

    public Animal(String name, String voice, boolean flag) {
        this.name = name;
        this.voice = voice;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
