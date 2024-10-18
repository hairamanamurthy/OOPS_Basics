package org.example.concurrency_1.example_2;

public class EvenPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<100;i++){
            if(i%2==0){
                System.out.println("Even printer:"+i);
            }
        }
    }
}
