package org.example.concurrency_1.example_1;

public class Main {
    public static void main(String[] args) {
        BasicTread basicTread=new BasicTread();
        Thread thread=new Thread(basicTread);
        thread.start();
        System.out.println("I am  in Main Thread and name is:"+ Thread.currentThread().getName());
    }
}

class test{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }
}

