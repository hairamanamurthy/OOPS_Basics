package org.example.tictactoe.models;

import org.example.generics_1.Pair;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    Pair<Integer,Integer> makeMove() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("It's "+ getName() +"'s turn Enter x:");
        int x=scanner.nextInt();
        System.out.println("Enter y:");
        int y=scanner.nextInt();
        return new Pair<>(x,y);
    }

    void undo(){

    }
}
