package zadanieExtends;

public class Animal implements AnimalRepository{
    private String race;
    private String owner;

    public Animal() {
    }

    public Animal(String race, String owner) {
        this.race = race;
        this.owner = owner;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void speak() {

    }
}
