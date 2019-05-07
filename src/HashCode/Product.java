package HashCode;


    /*
        hashCode to jest wstępne sprawdzenie czy 2 obiekty są takie same
        hashCode potrafi odpowiedzieć jednoznacznie na to, że 2 obiekty są
        różne, ale nie jest w stanie odpowiedzieć jednoznacznie na pytanie czy
        obiekty są takie same
        HASHCODE DZIAŁA SZYBCIEJ NIŻ EQUALS
        JEŚLI NIE MA TAKIEJ POTRZEBY TO EQUALS NIE JEST WYKONYWANY

        1) JEŚLI 2 OBIEKTY ZWRACAJĄ RÓŻNY HASHCODE TO JAVA
        STWIERDZA, ŻE OBIEKTY SĄ RÓŻNE.
        W TYM PRZYPADKU OBIEKT DODAWANY JEST DO Seta.

        2) JEŚLI 2 OBIEKTY ZWRACAJĄ TAKI SAM HASHCODE
        TO NASTĘPNIE WYWOŁANY JEST EQUALS.
        NO I EQUALS stwierdza czy dodać do SETA CZY NIE.
        JEŚLI EQUALS ZWRÓCI TRUE TO nie dodaje do SETA.

     */

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
        /*Random random = new Random();
        return random.nextInt(50_000);*/
    }

    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();

        products.add(new Product("pralka"));
        products.add(new Product("pralka"));
        products.add(new Product("żelazko"));
        products.add(new Product("telewizor"));
        products.add(new Product("dvd"));


        System.out.println(products);
    }
}
