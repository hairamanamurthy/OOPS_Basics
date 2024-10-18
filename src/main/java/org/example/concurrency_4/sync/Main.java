package org.example.concurrency_4.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Lock lock=new ReentrantLock();
       // ExecutorService es= Executors.newFixedThreadPool(2);
        Count count=new Count();
        Adder adder=new Adder(count);
       Subtractor subtractor=new Subtractor(count);
//        es.execute(adder);
//        es.execute(subtractor);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final value :"+ count.num);
       // es.shutdown();
    }
}
