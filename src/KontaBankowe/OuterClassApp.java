package KontaBankowe;

import java.util.Arrays;

public class OuterClassApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("wew1");
        OuterClass.InnerClass wew1 = outerClass.createNewInnerClass();
        System.out.println("wew2");
        OuterClass.InnerClass wew2 = outerClass.new InnerClass();

        OuterClass.InnerStaticClass wewS1 = new OuterClass.InnerStaticClass();
    }


}
