package com.artillery;
// This class will update the Cellstate grid
public class CellStateUpdate {
    public void populateShipsInGrid(CellState[][] field, ShipType[][] grid) { // how to show confirmed hit on ship grid??
        int row;
        int col;

        for (row = 0; row < BattleField.getSIZE(); row++) {
            for (col = 0; col < BattleField.getSIZE(); col++) {
                //conditionals OPEN, SHIP, HIT, MISS, SUNK;
                if (!grid[row][col].equals(ShipType.OPEN)) {
                    field[row][col] = CellState.SHIP;
                } else {
                    continue;
                }


            }
        }

    }

    public void writeHitMissSunk(GuessData guess, CellState result){ // likely will do a rendition of prgram data with grids and rows and columns
        CellState[][] field = guess.getField();
        ShipType[][] grid = guess.getGrid();
        int row = guess.getGuessRow();
        int col = guess.getGuessCol();

        if(){}

    }
}


