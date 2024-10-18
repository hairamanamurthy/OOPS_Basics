package org.example.Inheritance;

public class Instructor extends  User{
    String batchName;
    double avgrating;
    void scheduleClass(){
        System.out.println(username+" is taking "+ batchName);
    }
}
