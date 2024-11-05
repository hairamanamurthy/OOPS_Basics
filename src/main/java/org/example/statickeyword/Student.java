package org.example.statickeyword;

public class Student {
    String name;
    int age;
    static String university;
    public void printAge(){
        System.out.println("Age:"+age);
    }
    public static void print(){
        System.out.println("Inside print method");
    }
}
