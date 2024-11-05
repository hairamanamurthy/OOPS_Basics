package org.example.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {
    public static void main(String[] args) {
        readFile("E:\\Amrutha Cv.doc");
        checkAge("34yy");
        Connection connection=new Connection();
        connection.connect();
        try{
            connection.execute("select * from emp");
        }catch(RuntimeException re){
            System.out.println("Failed to exectute the query");
        }finally {
            connection.disconnect();
            //System.out.println();
        }
        validAge(17);

    }

    public static void validAge(int age){
        if(age<18){
            throw new invalidAgeException("Entered age below 18");
        }

    }
    public static boolean checkAge(String s){
        try {
            int i = Integer.parseInt(s);
            return i>=18;
        }catch (NumberFormatException nfe){
            System.out.println("Got a string"+s);
        }finally {
            System.out.println("i will be executed always");
        }
        return false;
    }
    public static void readFile(String path){
        try {
            FileReader fr = new FileReader(path);
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found sorry");
        }finally{
            System.out.println("I will be executed in all times");
        }
    }
}
