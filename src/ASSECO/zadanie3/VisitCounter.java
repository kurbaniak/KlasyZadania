package ASSECO.zadanie3;

import java.util.HashMap;
import java.util.Map;

public class VisitCounter {

    public Map<Long, Long> count(Map<String, UserStats> stats) {

        Map<Long, Long> result = new HashMap<>();
        for (Map.Entry<String, UserStats> entry : stats.entrySet()) {
            if (entry.getValue().visitCount.isPresent()) {

                Long userID = Long.parseLong(entry.getKey());
                Long visit = entry.getValue().visitCount.get();

                result.put(userID, visit);
            }
        }

        return result;

    }
}
/*      if (stats.get("service").visitCount.isPresent()) {

              }*/
//todo z tego nalezy skorzystac
//todo zamocuj liste stats i przekaz do metody count.
//todo Przyjmujemy ze String jest UserID do przeksztalcenia na Long
//todo odfiltruj z userStats liczbe odwiedzin i dodaj liczbe do mapy<UserID, Long>
//  Long counter = stats.get("jakis klucz").visitCount.get();
// stats.get("service").visitCount.orElseThrow(() -> new RuntimeException());
//  stats.get("service").visitCount.orElse(0L);

