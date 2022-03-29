package com.techreturners;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Peter", 'C', 2);

        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Upgrading student 2 grades...");
        student.upgrade();
        student.upgrade();
        System.out.println("Upgraded grade: " + student.getGrade());
        System.out.println("Downgrading student 1 grade...");
        student.downgrade();
        System.out.println("Downgraded grade: " + student.getGrade());
    }
}
