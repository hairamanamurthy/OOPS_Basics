package org.example.interfaces;

public interface Animal {
    public abstract void walk();
    public static final String name="ABC";
    default void  talk(){
        System.out.println("Animal is talking");
    }

}

class Dog implements Animal{

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void talk() {
        //Animal.super.talk();
        System.out.println("Dog is talking");
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println(Animal.name);
        Animal a=new Dog();
        a.talk();
        a.walk();
    }
}
