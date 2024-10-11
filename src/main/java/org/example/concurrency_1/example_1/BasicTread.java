package org.example.concurrency_1;

public class BasicTread implements Runnable {

    @Override
    public void run() {
        System.out.println("I am in a new thread and Name of Thread is:"+ Thread.currentThread().getName());
    }
}
