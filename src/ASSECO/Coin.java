package ASSECO;

public class Coin {

    private int[] coins;

    public Coin() {
    }

    public int[] getCoins() {
        return coins;
    }

    public void setCoins(int[] coins) {
        this.coins = coins;
    }

    public int solution(int[] A) {

        int zero = 0;
        int one = 0;

        for (int i : A) {
            if (i == 0) {
                zero++;
            } else
                one++;
        }

        if (zero < one) {
            return zero;
        }
        return one;
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        int[] tab = {1, 0, 0, 1, 0, 0};
        coin.setCoins(tab);
        System.out.println(coin.solution(tab));
    }
}

