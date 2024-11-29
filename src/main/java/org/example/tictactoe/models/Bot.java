package org.example.tictactoe.models;

import org.example.generics_1.Pair;

public class Bot extends Player{

    private BotLevel botLevel;

    public Bot(String name, char symbol, BotLevel botLevel) {
        super(name, symbol);
        this.botLevel = botLevel;
    }

    @Override
    Pair<Integer,Integer> makeMove() {
        return null;
    }
}
