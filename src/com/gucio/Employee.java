package com.gucio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String surname;
    private LocalDate birthday;
    private double seniority;
    private static List<Employee> allEmployees = new ArrayList<>();

    public static List<String> getEmpInfo() {
        List<String> tempList = new ArrayList<>();
        for (Employee e : allEmployees){
            tempList.add(e.getName());
        }
        return tempList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    public Employee(String name, String surname, LocalDate birthday, double seniority) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.seniority = seniority;
        allEmployees.add(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", seniority=" + seniority +
                '}';
    }


}
