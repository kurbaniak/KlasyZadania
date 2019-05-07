package BiuroPodrozy;

public class Trip {

private float pricePerNight;
private int nights;
private Continent continent;
private boolean animmlaAllowed;

    public Trip(float pricePerNight, int nights, Continent continent, boolean animmlaAllowed) {
        this.pricePerNight = pricePerNight;
        this.nights = nights;
        this.continent = continent;
        this.animmlaAllowed = animmlaAllowed;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public boolean isAnimmlaAllowed() {
        return animmlaAllowed;
    }

    public void setAnimmlaAllowed(boolean animmlaAllowed) {
        this.animmlaAllowed = animmlaAllowed;
    }

    @Override
    public String toString() {
        return "(" + pricePerNight +
                " *" + nights +
                ", " + continent +
                ", " + animmlaAllowed +
                ')';
    }
}
