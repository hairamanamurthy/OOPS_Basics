package org.example.tictactoe.models;

import lombok.Data;
import org.example.generics_1.Pair;

@Data
public abstract class Player {
    protected String name;
    protected char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    abstract Pair<Integer,Integer> makeMove();
}
