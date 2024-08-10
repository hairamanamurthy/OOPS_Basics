package org.example.Newp1;

public class Student1 {
    private int age;
    protected double psp;
    String name;
    public String Email;

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
        System.out.println("Email: " + Email);
    }
}
