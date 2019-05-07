package com.gucio;

import java.util.ArrayList;
import java.util.List;

public class Company{

private String name;
private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Company(String name) {
        this.name = name;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void getEmployeesInfo(){
        for (Employee employee:
             employeeList) {
            System.out.println(employee.toString());
        }
    }


}
