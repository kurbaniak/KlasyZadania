package Task2Firma;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
       EmployeeInfoProvider eip = new EmployeeInfoProvider();

       eip.displayEmployees();

       eip.displayRichEmployees();
        System.out.println();
       eip.displayAnnualMean();
    }
}
