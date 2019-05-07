package Wojna;

import com.gucio.Car;

import java.util.List;

public class NormalBattleAK implements Battle {
    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {

        boolean card1won = false;
        boolean card2won = false;
        int index1 = 0;
        int index2 = 0;

        while (true) {
            Card card1 = deck1.get(index1);
            Card card2 = deck2.get(index2);

            if (card1.getCardValue() > card2.getCardValue()) {
                card1won = true;
                card2won = false;
            } else if (card1.getCardValue() < card2.getCardValue()) {
                card1won = false;
                card2won = true;
            } else {
                card1won = false;
                card2won = false;
            }

            if (!card1won) index1++;
            if (!card1won) index2++;

            if ((index1 >= deck1.size()) && (index2 < deck2.size())) {
                return 1;
            } else if ((index2 >= deck2.size()) && (index1 < deck1.size())) {
                return -1;
            } else if ((index1 == deck1.size()) && index2 == deck2.size()) {
                return 0;
            }
        }


    }
}
