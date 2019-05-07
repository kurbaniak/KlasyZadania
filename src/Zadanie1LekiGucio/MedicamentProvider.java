package Zadanie1LekiGucio;

import Zadanie3Scrum.Task;

import java.util.*;

public class MedicamentProvider {

    Map<Integer, List<MedicamentNote>> medicals = new HashMap<>();

    public MedicamentProvider() {
        medicals.put(1, Arrays.asList(
                new MedicamentNote("Pyralgine", 1, 12),
                new MedicamentNote("Calcium", 3, 9)

        ));
        medicals.put(3, Arrays.asList(
                new MedicamentNote("Depakine", 3, 30)
        ));
        medicals.put(5, Arrays.asList(
                new MedicamentNote("Rutinoscorbin", 1, 5)
        ));
        medicals.put(10, Arrays.asList(
                new MedicamentNote("Calcium", 3, 9)
        ));
    }


    public void getExpensiveMedicament() {
        System.out.println("Medicaments more expensive than 10:");
        for (Map.Entry<Integer, List<MedicamentNote>> entry : medicals.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).getPrice() > 10) {
                    System.out.println("* " + entry.getValue().get(i).toString());
                }
            }
        }
    }

    public void getDays() {
        System.out.print("Remember to take the pils on: ");
        int temp = 0;

        for (Map.Entry<Integer, List<MedicamentNote>> entry : medicals.entrySet()) {
            for (int i = 0; i < entry.getKey(); i++) {
                if (entry.getKey() != temp) {
                    System.out.print(entry.getKey() + " ");
                    temp = entry.getKey();
                }
            }


        }
        System.out.println();

    }

    public void getAnnualCost() {
        System.out.print("Annual total for pils is: ");
        float totalPrice = 0;

        for (Map.Entry<Integer, List<MedicamentNote>> entry : medicals.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                totalPrice = totalPrice + entry.getValue().get(i).getPrice() * entry.getValue().get(i).getAmount() * 12;
            }
        }
        System.out.print(totalPrice);
    }

}




