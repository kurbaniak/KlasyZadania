package KontaBankowe;

import java.util.Arrays;

public class OuterClass {


    public static class InnerStaticClass{

    }

    public InnerStaticClass createNewStaticClass(){
        System.out.println("Klasa wewnetrzna STATYCZNA z metody");
        return new InnerStaticClass();
    }

    public class InnerClass{
        public InnerClass() {
            //System.out.println("Klasa wew z konstruktora");
        }
    }

    public InnerClass createNewInnerClass(){
        System.out.println("Klasa wewnetrzna z metody");
        return new InnerClass();
    }

    private static void createNewLocalClass(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }
        LocalClass localClass = new LocalClass();
        System.out.println(localClass);
    }
}
