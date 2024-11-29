package org.example.tictactoe;

import org.example.tictactoe.controllers.GameController;
import org.example.tictactoe.exceptions.InvalidBotCountException;
import org.example.tictactoe.models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws InvalidBotCountException {
        GameController gameController= new GameController();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num of human players");
        int n=scanner.nextInt();
        List< Player> playerList=new ArrayList<>();
        HashSet<String> nameSet=new HashSet<>();
        HashSet<Character> symbolSet=new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name;
            char symbol;
            try {
                System.out.println("Enter Name:");
                name = scanner.next();
                if (nameSet.contains(name)) {
                    throw new IllegalArgumentException("Name already Exists , please enter unique names");
                } else {
                    nameSet.add(name);
                    System.out.println("Name added successfully");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
                continue;
            }
            try {
                System.out.println("Enter Symbol");
                symbol = scanner.next().charAt(0);
                if (symbolSet.contains(symbol)) {
                    throw new IllegalArgumentException("Symbol already Exists , please enter unique symbol");
                } else {
                    symbolSet.add(symbol);
                    System.out.println("symbol added successfully");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                nameSet.remove(name);
                i--;
                continue;
            }
            Player humanPlayer = new HumanPlayer(name, symbol);
            playerList.add(humanPlayer);
        }
        System.out.println("Are bots going to play? (Y/N)");
        if(scanner.next().charAt(0)=='Y'){
            System.out.println("Emter bot level: (E/M/H)");
            char level= scanner.next().charAt(0);
            BotLevel botLevel=BotLevel.EASY;
            switch (level){
                case 'E':
                    botLevel=BotLevel.EASY;
                    break;

                case 'M':
                    botLevel=BotLevel.MEDIUM;
                    break;
                case 'H':
                    botLevel=BotLevel.HARD;
                    break;
                default:
                    System.out.println("Invalid choice , Enter E/M/H");
            }
            playerList.add(new Bot("Bot-1",'B',botLevel));
        }
        Game game=gameController.createGame(playerList);

        while (gameController.getGameStatue(game) == GameStatus.IN_PROGRESS){
                gameController.printBoard(game);
                gameController.makeMove(game);

        }
    }
}
