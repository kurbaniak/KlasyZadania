package Babcia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order  {
    public static void main(String[] args) {

    String grandmaString = "jabłka:30:1.20/dynia:1:11/masło:1:6/dynia:2:22/kartki swiateczne:1:20/piernik:20:2/pepsi:1:6/masło:2:6/mleko:1:3/ser:2:4";

    List<String> strings = new ArrayList<>();
    Map<Product, Integer> productIntegerMap = new HashMap<>();


    String[] parts = grandmaString.split("/");

        for (int i = 0; i < parts.length; i++) {
            String[] s = parts[i].split(":");
            Product product = new Product();
            product.setName(s[0]);
            int temp = Integer.parseInt(s[1]);
           product.setPrice(Float.parseFloat(s[2]));
           productIntegerMap.put(product, temp);
        }

        System.out.println(parts[0]);

    float totalPrice = 0;
    float minPrice = Float.MAX_VALUE;
    float maxPrice = 0;
    Product expensiveProduct = new Product();
    Product cheapestProduct = new Product();

        for(Map.Entry<Product,Integer> entry:  productIntegerMap.entrySet()){
            Product product = entry.getKey();
            int qty = entry.getValue();
            if (product.getPrice() > maxPrice){
                maxPrice = product.getPrice();
                expensiveProduct = product;
            }
            if (product.getPrice() < minPrice){
                minPrice = product.getPrice();
                cheapestProduct = product;
            }
            totalPrice = totalPrice +  product.getPrice()*qty;
            System.out.println(product.toString() + " please buy " + qty);
        }

        System.out.println("\nTotal Price: " + totalPrice);

        System.out.println("Most expensive product " + expensiveProduct.getName() + "(" + expensiveProduct.getPrice() + "/unit)");
        System.out.println("The cheapest product " + cheapestProduct.getName()+ "(" + cheapestProduct.getPrice() + "/unit)");


    }

}
