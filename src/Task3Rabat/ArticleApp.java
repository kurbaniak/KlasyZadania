package Task3Rabat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticleApp {
    public static void main(String[] args) {

       Article article = new Article();

       List<Article> articles = Arrays.asList(
               new Article("Shower gel", 23.08f, 1.23f),
               new Article("Shower cream", 14.5f, 1.3f),
               new Article("Pasta", 8.4f, 1.45f)
       );


       for(Article a: articles){
           for (int i = 0; i < a.getDiscount().length; i++) {
               float priceWithMargin = a.getPrice()*a.getMargin();
               float discountValue = priceWithMargin * a.getDiscount()[i];
               float finalPrice = priceWithMargin - discountValue;

               a.setPrice(finalPrice);
               System.out.println(a);// todo formatowanie wlasciwe output'a wg zadania
           }
       }

       //exteras
        BigDecimal price = new BigDecimal(123);
        BigDecimal margin = new BigDecimal(1.18);
        BigDecimal finalPrice = price.multiply(margin);


    }
}
