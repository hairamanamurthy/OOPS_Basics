package org.example.oops1;

public class Student {
    int age;
    double psp;
    String name;

    void change_Batch() {
        System.out.println("Change  batch");
    }

    void join_Class() {
        System.out.println(name + " Joining class");
    }

    void print_Details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PSP: " + psp);
    }
}