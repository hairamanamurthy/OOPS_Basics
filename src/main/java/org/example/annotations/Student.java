package org.example.annotations;

public class Student {
    String name;
    int age;
    @Deprecated
    public void printDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
    }
    public void printDetailsNew(){
        System.out.println("Name:"+name + "Age:"+age);
    }
}
