package org.example.Inheritance1;

public class Scenario2 {
    public static void main(String args[]){
        CC c=new CC();
    }
}

class AA {
    public AA(){
        System.out.println("A");
    }
}

class BB extends AA {
    public BB(){
        System.out.println("B");
    }
}

class CC extends BB {
    public CC(){ //There is no parameterless constructor available in 'org.example.Inheritance1.BB'
        System.out.println("C");
    }
}
