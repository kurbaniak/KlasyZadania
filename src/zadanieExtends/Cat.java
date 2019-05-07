package zadanieExtends;

public class Cat extends Animal implements AnimalRepository{

    private int age;
    private String color;

    public Cat() {
    }

    public Cat(String race, String owner, int age, String color) {
        super(race, owner);
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
