package org.example.Annonymous_classes;

public class AnnonymousClass {
    public static void main(String[] args) {
        Runnable r=new Runnable(){
            @Override
            public void run() {
                System.out.println("I am in Thread ");
                System.out.println("Save me");
            }
        };
        Thread t1=new Thread(r);
        t1.start();
    }
}
