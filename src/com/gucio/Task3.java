package com.gucio;

public class Task3 {
    public static void main(String[] args) {

        Player player1 = new Player("Jan","john");
        player1.setPoints(10);
        player1.setPoints(20);

        Player player2 = new Player("Tomek","Tom");

        Game game1 = new Game("szachy");

        game1.addPlayer(player1);
        game1.addPlayer(player2);



        game1.showGameInfo();

        System.out.println("Wygrywa:");
        System.out.println(game1.winner().toString());

    }
}
