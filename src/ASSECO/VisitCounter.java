package ASSECO;

import java.util.HashMap;
import java.util.Map;

public class VisitCounter {


    public static class User{

        String userID;
        Microservice microservice;

        public void runMicroservice(Microservice microservice){
            microservice.runned++;
        }

        public User() {
        }
    }

    public static class Microservice{

        String microserviceID;
        int runned;

        public Microservice(String microserviceID) {
            runned = 0;
            this.microserviceID = microserviceID;
        }
    }



    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();

        User user1 = new User();
        Microservice microservice1 = new Microservice("task1");

        user1.runMicroservice(microservice1);
        user1.runMicroservice(microservice1);



    }

}
