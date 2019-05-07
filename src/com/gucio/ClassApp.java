package com.gucio;

public class ClassApp {
    public static void main(String[] args) {

        Class class1 = new Class();

        Student student1 = new Student("Jan", "Kowalski", 22);
        Student student2 = new Student("Anna", "Nowak", 23);

        class1.addStudent(student1);
        class1.addStudent(student2);

        class1.displayStudents();
        System.out.println();
        System.out.println("This class has " + class1.getGirlsCount() + " girls.");

        class1.getAverageAge();

    }
}
