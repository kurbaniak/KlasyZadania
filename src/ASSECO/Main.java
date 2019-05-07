package ASSECO;

public class Main {
    public static void main(String[] args) {

        try{
            String liczba = null;
            Long pierwszaLiczba;
            pierwszaLiczba = Long.parseLong(liczba);


            Long drugaLiczba = 10L;
            Long wynik = pierwszaLiczba + drugaLiczba;
            System.out.println(wynik);
        }catch (NumberFormatException e){
            System.out.println("Zły format");
        }
    }
}
