package org.example.concurrency_1.example_3;

public class Main {
    public static void main(String[] args) {
        BasicThread basicThread=new BasicThread();
        Thread thread=new Thread(basicThread);
        thread.start();
        System.out.println("I am in main thread:"+Thread.currentThread().getName());
    }
}
