package org.example.concurrency_1.example_3;

public class BasicThread extends Thread{
    public void run(){
        System.out.println("I am in new thread:"+ Thread.currentThread().getName());
    }
}
