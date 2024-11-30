package org.example.tictactoe.controllers;

import org.example.tictactoe.exceptions.InvalidBotCountException;
import org.example.tictactoe.models.Game;
import org.example.tictactoe.models.GameStatus;
import org.example.tictactoe.models.Player;
import org.example.tictactoe.strategies.winning_strategy.PlayerWonStrategy;

import java.util.List;

public class GameController {

    public Game createGame(List<Player> playerList) throws InvalidBotCountException {
        Game game=Game.getBuilder()
                .setPlayers(playerList)
                .build();
        return game;
    }
    public GameStatus getGameStatue(Game game){
            return game.getGameStatus();
    }
    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
