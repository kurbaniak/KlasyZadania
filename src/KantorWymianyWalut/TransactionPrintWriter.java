package KantorWymianyWalut;

import java.io.*;

public class TransactionPrintWriter {

    private String fileName;

    private PrintWriter printWriter;

    public void storeToFile(String s){
        printWriter.println(s);
    }

    public TransactionPrintWriter(String fileName) throws FileNotFoundException{
        this.fileName = fileName;
        this.printWriter = new PrintWriter(fileName);
    }



    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }
}
