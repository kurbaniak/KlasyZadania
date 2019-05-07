package zadanieExtends;

public interface AnimalRepository {
    default void speak(){
        System.out.println("hello");
    };
    String ABC = "abc";
}
