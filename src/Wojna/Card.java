package Wojna;

public class Card {

    private int cardValue;
    private Color cardColor;
    private boolean isRare;

    public Card(int cardValue, Color cardColor, boolean isRare) {
        this.cardValue = cardValue;
        this.cardColor = cardColor;
        this.isRare = isRare;
    }

    public Card() {
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public Color getCardColor() {
        return cardColor;
    }

    public void setCardColor(Color cardColor) {
        this.cardColor = cardColor;
    }

    public boolean isRare() {
        return isRare;
    }

    public void setRare(boolean rare) {
        isRare = rare;
    }
}
