package Wojna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleApp {
    public static void main(String[] args) {

        List<Card> leftSet = createDeck (10);
        List<Card> rightSet = createDeck(10);

        createDeck(52);

        NormalBattle normalBattle = new NormalBattle();
        normalBattle.checkWinner(leftSet, rightSet);
    }

   // public static List<Card> createDect(int rareSeed, int deckSize){
    public static List<Card> createDeck(int deckSize){
        List<Card> rc = new ArrayList<>();
        //Random random = new Random(rareSeed);
        Random random = new Random();

        for (int i = 0; i < deckSize; i++) {
            int cValue = random.nextInt(10) +1;
            Color cColor = Color.values()[random.nextInt(Color.values().length)];
            boolean cRare = random.nextBoolean();
            rc.add(new Card(cValue, cColor, cRare));
        }
        return rc;
    }

    public void printDeck(){
        System.out.println("print");
    }

    public void newww(){

    }

    //todo cos dodane

    public void printDeck2(){
        System.out.println("print");
    }
}
