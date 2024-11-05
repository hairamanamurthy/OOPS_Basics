package org.example.lambda;

public class FinalVar {
    public void doSomething(){
       final  int myVar=8;
        int var2=0;
        Runnable  r=()->{
            System.out.println("I am in new Thread");
            // myVar++; //Variable used in lambda expression should be final or effectively final
            System.out.println(myVar); //this is final variable
            System.out.println(var2); //this is effective final
            int n=var2;
            n++;
        };
    }
}
