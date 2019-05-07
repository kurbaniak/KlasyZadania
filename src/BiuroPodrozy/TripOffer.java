package BiuroPodrozy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TripOffer {

    List<Trip> trips = new ArrayList<>();

    public TripOffer() {
    }

    public TripOffer(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void addNewTrip(float price, int nights, Continent continent, boolean withAnimal) {
        trips.add(new Trip(price, nights, continent, withAnimal));
    }

    public boolean bookOffer(float price, int duration, List<Continent> continents, boolean animal) {
        for (int i = 0; i < trips.size(); i++) {

            for (int j = 0; j < continents.size(); j++) {
                Continent continent = continents.get(j);
                if (price < trips.get(i).getPricePerNight() &&
                        duration == trips.get(i).getNights() &&
                        continent == trips.get(i).getContinent() &&
                        animal == trips.get(i).isAnimmlaAllowed()) {
                    trips.remove(i);
                    return true;
                }
            }
        }
        return false;

    }

    public boolean bookOffer2(float maxPrice, int minDuration, List<Continent> continents, boolean needPet) {
        Iterator<Trip> iterator = trips.iterator();
        while (iterator.hasNext()) {
            Trip actual = iterator.next();

            if (actual.getPricePerNight() <= maxPrice &&
                    actual.getNights() >= minDuration &&
                    continents.contains((actual.getContinent()))) {
                if (actual.isAnimmlaAllowed() || (actual.isAnimmlaAllowed() == needPet)) {
                    iterator.remove();
                    System.out.println("           ZNALEZIONE");
                    return true;
                }

            }
        }
        return false;
    }


    public void showTrips() {
        for (Trip trip : trips) {
            System.out.println(trip.toString());
        }
    }

}
