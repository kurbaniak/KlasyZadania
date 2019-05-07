package Wojna;

import java.util.List;
import java.util.Set;

public class NormalBattle implements Battle {


    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {
        int temp = 0;
        Card leftCard;
        int leftCardIndex = 0;
        Card rightCard;
        int rightCardIndex = 0;
        int set = 1;

        while (leftCardIndex < deck1.size() && rightCardIndex < deck2.size()){
            System.out.println("Set " + set);
            int lCard = deck1.get(leftCardIndex).getCardValue();
            int rCard = deck2.get(rightCardIndex).getCardValue();

            if(lCard> rCard){
                rightCardIndex  +=1;
                temp = -1;
                System.out.println(lCard + " < " + rCard + ", left card won.");
            }else if(lCard < rCard){
                leftCardIndex +=1;
                temp = 1;
                System.out.println(lCard + " > " + rCard +  ", right card won.");
            }else if (lCard == rCard){
                leftCardIndex += 1;
                rightCardIndex +=1;
                temp = 0;
                System.out.println( lCard + " = " + rCard + ", draw.");
            }
            set +=1;

        }

        switch (temp){
            case 1:
                System.out.println("Right deck won");
                break;
            case -1:
                System.out.println("Left deck won");
                break;
            case 0:
                System.out.println("DRAW");
        }

        return temp;
    }
}
