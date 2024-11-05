package org.example.generics_1;

public class Main {
    public static void main(String[] args) {

        ObjectPrinter objectPrinter = new ObjectPrinter("Ramana");
        objectPrinter.print();
        String s = (String) objectPrinter.get();
        System.out.println(s);
        //Integer i=(Integer)objectPrinter.get();//Run time error

        Printer<Integer> pi = new Printer<>(5);
        pi.print();
        Printer<String> ps = new Printer<>("rmaana");
        ps.print();

        Pair<String, Integer> psi = new Pair<>("Ramana", 12379898);
        psi.print();
        print(5);
        print("helllo");
        print(psi);

    }
        //Generic methods
        public static <T> void print(T something){
            System.out.println(something);
    }
}
