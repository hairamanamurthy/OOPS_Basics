package org.example.bounded_generics;

public class AnimalPrinter <T extends Animal>{
    T someAnimal;

    public AnimalPrinter(T someAnimal) {
        this.someAnimal = someAnimal;
    }

    public void giveFood(){
        someAnimal.eat();
       System.out.println(someAnimal.name);
    }
}
