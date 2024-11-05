package org.example.exception_handling;

public class Test {
    public static void main(String[] args) {
        String str = null;

        System.out.println(str);


        try {

            str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception Caught");

        } finally {

            System.out.println("Finally Block");

        }

    }
}
