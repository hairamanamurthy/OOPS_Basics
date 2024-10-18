package org.example.concrrency_3.adder_subtractor_problem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        Count count=new Count();
        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);
        es.execute(adder);
        es.execute(subtractor);
       es.shutdown();
      //  es.shutdown();
        System.out.println("Main Final Num value:"+count.num);
        //es.shutdown();
    }
}
