package KantorWymianyWalut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OdczytZapis{
    public static void main(String[] args) throws FileNotFoundException {
        String imie;
        String nazwisko;
        Scanner odczyt = new Scanner(System.in); //Obiekt do odbierania danych od uzytkownika
        System.out.println("Wprowadz swoje imie:");
        System.out.println("");
        imie = odczyt.nextLine();
        System.out.println("Wprowadz swoje nazwisko:");
        System.out.println("");
        nazwisko = odczyt.nextLine();
//System.out.println("Witaj "+imie);
        String imieNazwisko = nazwisko+(" ")+imie;

        PrintWriter zapis = new PrintWriter("Dane_uzytkownika.txt");
/*zapis.println("Dane wprowadzone przez uzytkownika");
zapis.println("");*/
        zapis.println(imieNazwisko);
        zapis.println(imieNazwisko);
        zapis.println(imieNazwisko);
        zapis.close();

        File plik = new File("Dane_uzytkownika.txt");
        Scanner in = new Scanner(plik);

        String zdanie = in.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("Wprowadzone dane");
        System.out.println("");
        System.out.println(zdanie);

    }
}
