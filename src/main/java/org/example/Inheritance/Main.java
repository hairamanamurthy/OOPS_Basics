package org.example.Inheritance;

public class Main {
    public static void main(String args[]){
        Instructor i=new Instructor();
        i.avgrating=4.5;
        i.batchName="Aug23 beginner";
        i.username="Murthy";
        i.login();
        i.scheduleClass();
    }
}
