package org.example.opps_4;

public class Scenario {
    public static void main(String args[]){
        A a=new C();
        a.print();

        a=new B();
        a.print();

        a=new A();
        a.print();
    }
}
class A{
    void print(){
        System.out.println("A");
    }
}
class B extends A{
    void print(){
        System.out.println("B");
    }
}
class C extends B{
    void print(){
        System.out.println("C");
    }
}
