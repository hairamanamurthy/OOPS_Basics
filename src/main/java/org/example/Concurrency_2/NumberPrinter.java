package org.example.Concurrency_2;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Starting new thread");
        for(int i=1;i<10;i++)
            System.out.println(i+" "+ Thread.currentThread().getName());
    }
}
