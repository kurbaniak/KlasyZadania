package BiuroPodrozy;

import java.util.List;

public enum Continent  {
    EU("Europa"), AF("Afryka"), AS("Azja");

    private String continentName;

    Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}
