package org.example.poly1;

public class Main {
    public static void main(String[] args) {
        C c=new C();
        System.out.println("Debut");
        A a=c;
        System.out.println(a.a);
        System.out.println(a.b);
//        System.out.println(a.c);//Cannot resolve symbol 'c'
        System.out.println(c.c);

    }
}
class A{
    int a,b;
}
class B extends A{
    int c;
}
class C extends B{
    int d;
}
