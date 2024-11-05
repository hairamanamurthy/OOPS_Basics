package org.example.generics_1;

public class ObjectPrinter {
    Object objtoprint;

    public ObjectPrinter(Object objectPrinter) {
        this.objtoprint = objectPrinter;
    }
    public void print(){
        System.out.println(objtoprint);
    }
    public Object get(){
        return objtoprint;
    }
}
