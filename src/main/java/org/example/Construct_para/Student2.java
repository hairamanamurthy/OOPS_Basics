package org.example.Construct_para;

public class Student2 {
    int age;
    String name;
    double psp;
    public Student2(int age, String name,double psp){
        this.name=name;
        this.age=age;
        this.psp=psp;
    }

    public Student2(int age, String name){
        this.name=name;
        this.age=age;
        this.psp=psp;
    }

    void print(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("PSP:"+psp);
    }
}
