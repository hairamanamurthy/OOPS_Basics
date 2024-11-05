package org.example.bounded_generics;

public class Main {
    public static void main(String[] args) {
        AnimalPrinter<Cat> catAnimalPrinter=new AnimalPrinter<>(new Cat());
        //catAnimalPrinter.giveFood();
        AnimalPrinter<Animal> animalAnimalPrinter=new AnimalPrinter<>(new Animal());
       // animalAnimalPrinter.giveFood();
    }
}
