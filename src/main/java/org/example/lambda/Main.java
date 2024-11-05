package org.example.lambda;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println(" A new thread is started in anonymous class");
            }
        };
        Runnable r1=()->{
            System.out.println("This is anonymous class -2 thread");
        };
        Callable<Integer> c1=() -> 5;

        Thread t=new Thread(r1);
        t.start();

        A a= n-> System.out.println("N:"+ (++n));

        a.call(7);

        B b=(x,y)-> System.out.println("Sum:"+ (x+y) );
        b.sum(10,20);

        C c=(x,y)-> (x+y);

        c.sum(10,20);
    }
}

interface A{
    public void call(int n);
}

interface B{
    public void sum(int a, int b);
}

interface C{
    public int sum(int x, int y);
}
