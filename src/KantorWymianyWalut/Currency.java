package KantorWymianyWalut;

public enum  Currency {

    USD("USD"),
    PLN("PLN"),
    EUR("EUR");

    String description;

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
