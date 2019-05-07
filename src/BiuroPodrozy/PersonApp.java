package BiuroPodrozy;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person();

        person.gender = Gender.MEN;
        person.size = Size.S;


        System.out.println(person.gender);
        System.out.println(person.size.getFullName());
    }
}
