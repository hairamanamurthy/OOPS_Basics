package org.example.concurrency_semaphore.implementing_printer_problem;

public class Main {
    public static void main(String[] args) {
        PrinterAccess pa=new PrinterAccess();
        Thread t1=new Thread(pa);
        Thread t2=new Thread(pa);
        Thread t3=new Thread(pa);
        t1.start();
        t2.start();
        t3.start();
    }
}
