package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        String file = "/test.txt";

        try (Scanner scanner = new Scanner(new File(file))) {
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma pliku");
        }
        System.out.println("Koniec");

    }
}
