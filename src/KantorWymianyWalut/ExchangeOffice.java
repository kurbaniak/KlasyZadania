package KantorWymianyWalut;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {

    private Map<Currency, Double> availableFunds;
    private TransactionsHistory transactionsHistory;

    public TransactionsHistory getTransactionsHistory() {

        return transactionsHistory;
    }

    public ExchangeOffice(double startFunds) {

        this.transactionsHistory = new TransactionsHistory();
        this.availableFunds = new HashMap<>();
        for (Currency c : Currency.values()) {
            availableFunds.put(c, startFunds);
        }
    }

    public void showFunds() {
        System.out.println("Current funds: ");
        for (Map.Entry<Currency, Double> entry : availableFunds.entrySet()) {
            System.out.print(entry.getValue() + " " + entry.getKey().getDescription() + "; ");
        }
        System.out.println();
    }


    public void exchange(double amount, Currency from, Currency into) {
        double available = availableFunds.get(into);
        double needed = amount * 0.8 / CurrencyConverter.convert(from, into);


        if (available >= needed) {
            availableFunds.put(from, availableFunds.get(from) + amount);
            availableFunds.put(into, availableFunds.get(into) + -needed);

            System.out.println("Exchanging " + amount + " "
                    + from.getDescription() + " to " + needed + " "
                    + into.getDescription());

        } else {
            System.out.println(" Cannot exchange " + amount + " "
                    + from.getDescription() + " to " + needed + " "
                    + into.getDescription() + " insufficient funds.");
        }

    }

    public String exchangeGucio(double amount, Currency from, Currency into) throws IOException {
        double available = availableFunds.get(into);
        double needed = amount * 0.8 / CurrencyConverter.convert(from, into);
        String result;

        if (available >= needed) {
            availableFunds.put(from, availableFunds.get(from) + amount);
            availableFunds.put(into, availableFunds.get(into) + -needed);

            result = "Exchanging " + amount + " "
                    + from.getDescription() + " to " + needed + " "
                    + into.getDescription();

        } else {
            result = " Cannot exchange " + amount + " "
                    + from.getDescription() + " to " + needed + " "
                    + into.getDescription() + " insufficient funds.";
        }

        transactionsHistory.addToHistory(result);

        return result;
    }
}
//TODO zadanie domowe poz. 1
//TODO dopisz klase, ktora bedzie rejestorowala kazda transakcje w ArrayList
//TODO dopisz metode sprawdzajaca transakcje na koniec dnia.

//TODO zadanie domowe poz. 2
//TODO dopisz klase, ktora bedzie rejestorowala kazda transakcje w pliku tekstowym
//TODO napisz metode, ktora odczytuje transakcje na koniec dnia z pliku tekstowego.