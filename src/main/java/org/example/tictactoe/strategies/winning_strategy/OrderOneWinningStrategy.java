package org.example.tictactoe.strategies.winning_strategy;

import org.example.tictactoe.models.Cell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy  implements PlayerWonStrategy{
    List<HashMap<Character,Integer>> rowMaps;
    List<HashMap<Character,Integer>> colMaps;
    HashMap<Character,Integer> diagnalMap;
    HashMap<Character,Integer> reverseDiagnalMap;
    int size;

    public OrderOneWinningStrategy(int size) {
        this.size=size;
        this.rowMaps =new ArrayList<>();
        for(int i=0;i<size;i++){
            this.rowMaps.add(new HashMap<>());
        }

        this.colMaps =new ArrayList<>();
        for(int i=0;i<size;i++){
            this.colMaps.add(new HashMap<>());
        }

        this.diagnalMap = new HashMap<>();
        this.reverseDiagnalMap = new HashMap<>();
    }

    @Override
    public boolean checkIfWon(Cell cell) {
        /*
        step 1: update the hashmaps
        step 2: check if the player won using hashmaps
         */
        int x=cell.getX();
        int y= cell.getX();
        char symbol=cell.getPlayer().getSymbol();
        rowMaps.get(x).put(symbol,rowMaps.get(x).getOrDefault(symbol,0)+1);
        colMaps.get(y).put(symbol,colMaps.get(y).getOrDefault(symbol,0)+1);
        if(checkIfCellIsOnDiagnal(x,y)){
            diagnalMap.put(symbol,diagnalMap.getOrDefault(symbol,0)+1);
        }
        if(checkIfCellIsOnReverseDiagnal(x,y)){
            reverseDiagnalMap.put(symbol,reverseDiagnalMap.getOrDefault(symbol,0)+1);
        }

        //step 2;
        if(rowMaps.get(x).get(symbol) == size){
            return true;
        }
        if(colMaps.get(y).get(symbol)==size){
            return true;
        }
        if(checkIfCellIsOnDiagnal(x,y)){
            return diagnalMap.get(symbol)==size;
        }
        if(checkIfCellIsOnReverseDiagnal(x,y)){
            return reverseDiagnalMap.get(symbol)==size;
        }
        return false;
    }
    private boolean checkIfCellIsOnDiagnal(int x, int y){
        return x==y;
    }

    private boolean checkIfCellIsOnReverseDiagnal(int x, int y){
        return x+y== size-1;
    }


}