package org.example.concurrency_4_sync_methos;

public class Count {
    int num;
    public synchronized void incrementValue(){
        this.num++;
    }
    public synchronized void decrementValue(){
        this.num--;
    }
}
