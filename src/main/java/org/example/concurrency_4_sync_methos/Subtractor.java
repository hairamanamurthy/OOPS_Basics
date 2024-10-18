package org.example.concurrency_4_sync_methos;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            count.decrementValue();
        }
      //  System.out.println("end of subtractor");
    }
}
