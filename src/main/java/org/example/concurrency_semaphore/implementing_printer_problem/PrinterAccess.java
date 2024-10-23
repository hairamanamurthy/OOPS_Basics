package org.example.concurrency_semaphore.implementing_printer_problem;

import java.util.concurrent.Semaphore;

public class PrinterAccess implements Runnable{
    Semaphore s=new Semaphore(2);

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+": is trying to access printer");
            s.acquire();
            System.out.println(Thread.currentThread().getName()+"is acquired the printer");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"is done using printer");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        s.release();
        System.out.println(Thread.currentThread().getName()+":is released the printer");
    }
}
