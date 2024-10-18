package org.example.concrrency_3.adder_subtractor_problem;

public class Adder implements Runnable{
    Count count;
    public Adder(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
          //  System.out.println("increment");
            count.num++;
        }
       System.out.println("add Final Num value:"+count.num);
    }
}
