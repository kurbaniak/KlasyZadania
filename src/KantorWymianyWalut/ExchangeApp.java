package KantorWymianyWalut;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExchangeApp {
    public static void main(String[] args) throws IOException {


        //CurrencyConverter.convert(Currency.EUR, Currency.PLN);
        ExchangeOffice exchangeOffice = new ExchangeOffice(100);
        exchangeOffice.showFunds();
        exchangeOffice.exchange(10, Currency.PLN, Currency.EUR);
        exchangeOffice.showFunds();
        exchangeOffice.exchange(20, Currency.EUR, Currency.PLN);
        exchangeOffice.showFunds();
        exchangeOffice.exchange(20, Currency.USD, Currency.EUR);
        exchangeOffice.showFunds();


        ExchangeOffice exchangeOfficeGucio = new ExchangeOffice(100);
        exchangeOfficeGucio.showFunds();
        exchangeOfficeGucio.exchangeGucio(10, Currency.PLN, Currency.EUR);
        exchangeOfficeGucio.exchangeGucio(20, Currency.PLN, Currency.EUR);
        //exchangeOfficeGucio.exchangeGucio(20, Currency.EUR, Currency.PLN);
        //exchangeOfficeGucio.exchangeGucio(20, Currency.USD, Currency.EUR);

        exchangeOfficeGucio.getTransactionsHistory().showTransactionHistory();


        exchangeOfficeGucio.getTransactionsHistory().storeToFile("TransactionsHistory.txt");




    }
}
