package KantorWymianyWalut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CurrencyConverter {

    public static double convert(Currency from, Currency to){

        try {
            URL url = new URL("https://free.currconv.com/api/v7/convert?q=USD_PLN&compact=ultra&apiKey=cd8b88536350a5db7a5e&amp");

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String lines = reader.readLine();
             System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + lines);
            reader.close();

        if(lines.length() > 0){

            int startIndex = lines.indexOf(":") + 1;
            int endIndex = lines.indexOf("}");
            String value = lines.substring(startIndex, endIndex);
           // System.out.println(value);
            return Double.parseDouble(value);

            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;

    }
}
