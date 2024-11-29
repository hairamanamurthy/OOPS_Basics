package org.example.tictactoe.models;

import lombok.Data;

@Data
public class Cell {
    private int x;
    private int y;
    private Player player;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        if(player!=null){
            System.out.print(player.getSymbol());
        }
        else{
            System.out.print(" _ ");
        }
    }

    public boolean isEmptyCell(){
        return player==null;
    }
}
