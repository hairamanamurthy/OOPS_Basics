package org.example.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("File reading started");
        readFile("adadfasd");
        System.out.println("File Reading finished");
    }
    public static void readFile(String path) throws FileNotFoundException{
        FileReader fr=new FileReader(path);
    }
}
