package BiuroPodrozy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripApp {

    public static void main(String[] args) {


        TripOffer tripOffer = new TripOffer();

        tripOffer.addNewTrip(500, 7, Continent.EU, false);
        tripOffer.addNewTrip(550, 10, Continent.EU, false);
        tripOffer.addNewTrip(400, 7, Continent.AS, true);
        tripOffer.addNewTrip(1000, 7, Continent.EU, false);

        tripOffer.showTrips();



        tripOffer.bookOffer2(400, 7, Arrays.asList(Continent.AS) ,false );
        System.out.println("~~~~~~~~~~");
        tripOffer.showTrips();


    }



}
