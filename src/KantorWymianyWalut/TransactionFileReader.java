package KantorWymianyWalut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TransactionFileReader {

 private Scanner scanner;
 private File file;

 public void readFile(File file)throws FileNotFoundException {
     System.out.println("Readed file" + file.getName());
     scanner = new Scanner(file);
     while(scanner.nextLine()!= null){
         System.out.println(scanner.nextLine());
     }


 }
}
