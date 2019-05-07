package Zadanie2Kwiaty;

import java.util.HashMap;
import java.util.Map;

public class FlowerApp {
    public static void main(String[] args) {

        Map<Integer, Flower> flowers = new HashMap<>();


        Flower flower1 = new Flower("Tulipan", 0, false, 2);
        Flower flower2 = new Flower("Daffodil", 0, false, 3);
        Flower flower3 = new Flower("Violet", 0, false,4);
        Flower flower4 = new Flower("Rose", 0, false,5);

        flowers.put(flower1.getDistance(), flower1);
        flowers.put(flower2.getDistance(), flower2);
        flowers.put(flower3.getDistance(), flower3);
        flowers.put(flower4.getDistance(), flower4);

       /* for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.entrySet().toString());
        }*/

        for (Map.Entry<Integer, Flower> entry: flowers.entrySet()){
            String s = entry.getValue().toString();

            System.out.println(s);

        }


    }
}
