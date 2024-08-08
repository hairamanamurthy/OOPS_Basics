package org.example.oops1;

public class Main {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ramana";
        s1.age = 34;
        s1.psp = 90;
        s1.change_Batch();
        s1.join_Class();
        s1.print_Details();
        Student s2=new Student();
        s2.name="Ram";
        s2.age=33;
        s2.psp=96;
        s2.join_Class();
        s2.change_Batch();
        s2.print_Details();
    }
}
