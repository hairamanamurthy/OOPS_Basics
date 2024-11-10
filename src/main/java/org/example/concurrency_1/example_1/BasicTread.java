package org.example.concurrency_1.example_1;

public class BasicTread implements Runnable {

    @Override
    public void run() {
        System.out.println("I am in a new thread and Name of Thread is:"+ Thread.currentThread().getName());
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }
}
