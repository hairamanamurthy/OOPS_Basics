package org.example.Inheritance1;

public class Scenario3 {
    public static void main(String args[]){
        CCC c=new CCC();
    }
}

class AAA {
    public AAA(){
        System.out.println("A");
    }
    public AAA(String s){
        System.out.println("B:"+s);
    }
}

class BBB extends AAA {
    public BBB(String s){
        System.out.println("B:"+s);
    }
    public BBB(int s){
        System.out.println("B:"+s);
    }
}

class CCC extends BBB {
    public CCC(){ //There is no parameterless constructor available in 'org.example.Inheritance1.BB'
       // super("Hello its a para constrcutor");
        super(20);
        System.out.println("C");
       // super("Hello its a para constrcutor");
    }
}
