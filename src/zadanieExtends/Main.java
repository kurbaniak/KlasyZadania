package zadanieExtends;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

         ((Dog) dog).getAge();
         dog.getOwner();

         AnimalRepository cat1 = new Cat();
         cat1.speak();

    }
}
