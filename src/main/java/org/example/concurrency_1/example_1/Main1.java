package org.example.concurrency_1.example_1;

import java.util.Comparator;
import java.util.List;

public class Main1 implements Cloneable{
    static int x=10;

    public static void main(String[] args) {
        Main1 m1=new Main1();
        Main1 m2=new Main1();
        System.out.println(m1.x +" " + m2.x);
        m1.x=20;

        List<String> l=List.of("aapple","Mango","guava");
        //Comparator<String> cmp=(s1,s2)

    }
}
