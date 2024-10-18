package org.example.concurrency_1.example_2;

public class Main {
    public static void main(String[] args) {
        OddPrinter op=new OddPrinter();
        EvenPrinter ep=new EvenPrinter();
        Thread oddp=new Thread(op);
        Thread evenp=new Thread(ep);
//        oddp.start(); //start(): This creates a new thread and calls the run() method on that thread.
//        evenp.start();
        oddp.run(); //run(): This simply runs the code in the run() method in the same thread that calls it, without creating a new thread.
        evenp.run();
    }
}
