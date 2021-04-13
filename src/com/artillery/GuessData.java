package com.artillery;

public class GuessData {
    public int getGuessRow() {
        return guessRow;
    }

    public int getGuessCol() {
        return guessCol;
    }

    public ShipType[][] getGrid() {
        return grid;
    }

    public CellState[][] getField() {
        return field;
    }

    //integers
    private int guessRow;
    private int guessCol;


    //game objects
    private ShipType[][] grid;
    private CellState[][] field;


    public GuessData(int guessRow, int guessCol, ShipType[][] grid, CellState[][] field){
        this.guessRow = guessRow;
        this.guessCol = guessCol;
        this.grid = grid;
        this.field = field;

    }
}



