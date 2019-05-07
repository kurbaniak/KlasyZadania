package Task2Firma;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EmployeeInfoProvider {

    private List<Employee> empl = new ArrayList<>();

    private void loadEmployee() {
        this.empl = Arrays.asList(
                new Employee("programmer", 12000),
                new Employee("secretary", 6500),
                new Employee("programmer", 13500),
                new Employee("programmer", 4000)
        );

    }

    public EmployeeInfoProvider() {
        loadEmployee();
    }

    public List<Employee> getEmpl() {
        return empl;
    }

    public void displayEmployees() {
        //sample1
        //  for (Employee e:empl) {
        //    System.out.println(e);;
        // }

        //sample 2
        empl.forEach(System.out::println);
    }

    public void displayRichEmployees() {
        List<Integer> ritchID = new ArrayList<>();
        for (int i = 0; i < empl.size(); i++) {
            if (empl.get(i).getSolary() > 7000) {
                ritchID.add(empl.get(i).getId());
            }
        }
        System.out.print("Employees who earn more than 7k: ");
        for (int i = 0; i < ritchID.size(); i++) {
            System.out.print(ritchID.get(i));
            if (i < ritchID.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }

        }
    }

    public void displayAnnualMean(){
        float mean =0;
        int count = 0;
        for(Employee e: empl){
            if(e.getPosition().equals("programmer")){
                mean += e.getSolary() * 12;
                count ++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        mean/=count;

        System.out.println("Mean annual salary for programmers is: " + df.format(mean));
    }
}
