package com.gucio;

import java.time.LocalDate;

public class Task4 {
    public static void main(String[] args) {

        Company company1 = new Company("Sony");

        Employee employee1 = new Employee("Jan","Kowalski", LocalDate.of(1990, 3, 20), 2.5);
        Employee employee2 = new Employee("Anna","Nowak", LocalDate.of(1980, 1, 11), 8.5);


        company1.addEmployee(employee1);
        company1.addEmployee(employee2);

        company1.getEmployeesInfo();
        System.out.println("~~~~~~~~~~");
        System.out.println(Employee.getEmpInfo());
    }

}
