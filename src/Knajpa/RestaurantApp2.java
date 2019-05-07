package Knajpa;

import java.math.BigDecimal;

public class RestaurantApp2 {
    public static void main(String[] args) {

        BigDecimal orderPrice = new BigDecimal(1345.71);

        Coins coins = new Coins();
        BigDecimal counter = new BigDecimal(0);

        for (int i = 0; i < coins.getCoints().length; i++) {
            BigDecimal coint = new BigDecimal(coins.getCoints()[i]);

            counter =  orderPrice.divide(coint);
            System.out.println(coins.getCoints()[i] + " " + counter);
            orderPrice = orderPrice.subtract(counter.multiply(coint));

        }

        System.out.println(orderPrice);
    }
}
