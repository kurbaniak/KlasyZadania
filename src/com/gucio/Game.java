package com.gucio;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private String name;
    List<Player> playerList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }



    public Game(String name) {
        this.name = name;
    playerList = new ArrayList<>();
    }

    public void addPlayer(Player p){
        playerList.add(p);
    }

    public void showGameInfo(){
        System.out.println("W grze "+ name + " uczestniczą");
        for (Player p : playerList
             ) {
            System.out.println(p.toString());
        }
    }

    public Player winner(){
        Player temp = new Player();
        temp.setPoints(0);

        for (Player p :playerList) {
            if (p.getPoints() > temp.getPoints() && p.getPoints() >= 100){
                 temp = p;
            }
        }

        return temp;
    }

}
