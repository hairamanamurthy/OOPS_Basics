package org.example.tictactoe.strategies.winning_strategy;

import org.example.tictactoe.models.Cell;

public interface PlayerWonStrategy {

    boolean checkIfWon(Cell cell);
}
