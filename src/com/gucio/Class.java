package com.gucio;

import java.util.ArrayList;
import java.util.List;

public class Class {

    List<Student> names = new ArrayList<>();

    void addStudent(Student student) {
        names.add(student);
    }

    void displayStudents() {
        if(names.size() == 0){
            System.out.println("This class has no students");
        }else {

            System.out.print("Students: ");
            for (int i = 0; i < names.size() - 1; i++) {
                System.out.print(names.get(i).getFirstName() + ", ");
            }
            System.out.print(names.get(names.size() - 1) + ".");
        }
    }

    int getGirlsCount() {
        int temp = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getFirstName().endsWith("a")) {
                temp = temp + 1;
            }
        }

        return temp;

    }

    public void getAverageAge(){
        float temp = 0;
        for (Student student:names) {
            temp= temp + student.getAge();
        }
        System.out.print("Average age of students: ");
        System.out.println(temp/names.size() + ".");
    }


}
