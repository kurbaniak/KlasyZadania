package Zadanie1Leki;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class MedicamentNoteApp {
    public static void main(String[] args) {


        Map<Integer, MedicamentNote> medicaments = new HashMap<>();

        medicaments.put(1, new MedicamentNote("polopiryna", 2, 10.0));
        medicaments.put(3, new MedicamentNote("gripex", 1, 14.100));
        medicaments.put(10, new MedicamentNote("aspiryna", 3, 9.20));


        for (Map.Entry<Integer, MedicamentNote> entry : medicaments.entrySet()) {

            if (entry.getValue().getCostPerUnit() > 10) {
                System.out.println(entry.getValue().getName());
            }
        }
        for (Map.Entry<Integer, MedicamentNote> entry : medicaments.entrySet()) {
            System.out.print(entry.getKey() + " ");

        }

        double sum = 0;


        for (Map.Entry<Integer, MedicamentNote> entry : medicaments.entrySet()) {
            sum += entry.getValue().getUnit() * entry.getValue().getCostPerUnit() * 12;

        }
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println("\n" + df.format(sum));
    }
}