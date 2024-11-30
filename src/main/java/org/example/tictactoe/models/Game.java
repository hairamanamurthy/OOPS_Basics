package org.example.tictactoe.models;

import org.example.generics_1.Pair;
import org.example.tictactoe.exceptions.InvalidBotCountException;
import org.example.tictactoe.strategies.winning_strategy.OrderOneWinningStrategy;
import org.example.tictactoe.strategies.winning_strategy.PlayerWonStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private int currentPlayerIdx;
    private GameStatus gameStatus;
    private List<Move> moves;
    private PlayerWonStrategy playerWonStrategy;

    private Game(GameBuilder gameBuilder){
        this.players=gameBuilder.players;
        int n=players.size();
        this.board=new Board(n+1);
        this.currentPlayerIdx=0;
        this.moves=new ArrayList<>();
        this.gameStatus=GameStatus.IN_PROGRESS;
        playerWonStrategy=new OrderOneWinningStrategy(n+1);
    }

    public static GameBuilder getBuilder(){
        return new Game.GameBuilder();
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void printBoard() {
        this.board.printBoard();
    }

    public void makeMove() {
        Player player=players.get(currentPlayerIdx);
        Pair<Integer, Integer> pair=player.makeMove();
        //validate if the cell is empty or not
        //if(this.board.isEmpty(pair.getKey(),pair.getValue()))
        this.board.setPlayer(pair.getKey(),pair.getValue(),player);
        Move move=new Move(player,this.board.getCell(pair.getKey(),pair.getValue()));
        this.moves.add(move);
        Cell cell1=this.board.getCell(pair.getKey(),pair.getValue());
        //check if someone has won
        if(playerWonStrategy.checkIfWon(cell1)){
            this.gameStatus=GameStatus.WON;
            return ;
        }
        if(moves.size()==(players.size()+1) * (players.size()+1)){
            this.gameStatus=GameStatus.DRAW;
            return;
        }
        this.currentPlayerIdx=(this.currentPlayerIdx+1) % this.players.size();

    }

    public Player getWinner() {
        return this.players.get(currentPlayerIdx);
    }


    public static class GameBuilder{
        private List<Player> players;

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build() throws InvalidBotCountException {
            int botCount=0;
            for(Player player: players){
                if(player instanceof Bot){
                    botCount++;
                }
                if(botCount>1){
                    throw new InvalidBotCountException("At max only 1 bot allowed");
                }
            }
            return new Game(this);
        }
    }
}
