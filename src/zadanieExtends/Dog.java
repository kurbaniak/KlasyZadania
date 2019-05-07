package zadanieExtends;

public class Dog extends Animal{
    private int age;

    public Dog() {
    }

    public Dog(String race, String owner, int age) {
        super(race, owner);
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
