package Wojna;

import java.util.List;

public class ColorBattle implements Battle {
    @Override
    public int checkWinner(List<Card> deck1, List<Card> deck2) {
        int colorValue1 = 0;
        int colorValue2 = 0;

        for(Card c:deck1){
            colorValue1 += c.getCardColor().getColorValue();
        }

        for(Card c:deck2){
            colorValue2 += c.getCardColor().getColorValue();
        }

        if (colorValue1 > colorValue2){
            return 1;
        }else if (colorValue1 < colorValue2){
            return -1;
        }else

        return 0;
    }
}
