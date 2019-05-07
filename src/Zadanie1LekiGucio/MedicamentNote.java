package Zadanie1LekiGucio;

public class MedicamentNote {
    private String name;
    private int amount;
    private int price;

    public MedicamentNote(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", which coasts " + price + " and needs to be taken on " + amount + '.';
    }
}
