package Wojna;

public enum Color {
    Trefl (1), Karo(2), Kier(3), Pik(4);

    private int colorValue;

    Color(int colorValue) {
        this.colorValue = colorValue;
    }

    public int getColorValue() {
        return colorValue;
    }
}
