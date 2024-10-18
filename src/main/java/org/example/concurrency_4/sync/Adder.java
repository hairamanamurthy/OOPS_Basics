package org.example.concurrency_4.sync;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;


    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            synchronized (count) {
                count.num++;
            }
        }
       // System.out.println("end of Adder");
    }
}
