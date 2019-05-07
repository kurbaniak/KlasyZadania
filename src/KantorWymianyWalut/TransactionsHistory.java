package KantorWymianyWalut;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TransactionsHistory {


    private List<String> historyOfTransactions = new ArrayList<>();

    public void addToHistory(String transaction) {
        historyOfTransactions.add(transaction);

    }

    public void showTransactionHistory() {
        System.out.println("All transactions:");
        for (String s : historyOfTransactions) {
            System.out.println(s);
        }
    }


    public void storeToFile(String fileName) throws FileNotFoundException {

        TransactionPrintWriter transactionPrintWriter = new TransactionPrintWriter(fileName);

        for (String str : historyOfTransactions) {
            System.out.println(str);
            transactionPrintWriter.storeToFile(str);
        }
        transactionPrintWriter.getPrintWriter().close();

    }


}
