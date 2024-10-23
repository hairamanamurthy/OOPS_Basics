package org.example.concrrency_3.adder_subtractor_problem;

public class Subtractor implements Runnable {
    Count count;
    public Subtractor(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            //System.out.println("decrement");
            count.num--;
        }
        System.out.println("sub Num value:"+count.num);
    }
}
