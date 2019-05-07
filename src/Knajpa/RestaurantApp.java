package Knajpa;

import java.math.BigDecimal;

public class RestaurantApp {
    public static void main(String[] args) {

        float orderPrice = 1193.73f;

        Coins coins = new Coins();
        int counter = 0;


        for (int i = 0; i < coins.getCoints().length; i++) {

            double coint = coins.getCoints()[i];
            counter = (int) (orderPrice / coint);
            System.out.println(coins.getCoints()[i] + " " + counter);
            orderPrice = orderPrice - (float) (counter * coins.getCoints()[i]);


        }
        System.out.println(orderPrice);

    }
}

