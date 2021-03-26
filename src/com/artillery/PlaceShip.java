package com.artillery;

public class PlaceShip { // how to bring in the values here? do i initialize the program data class here? here?

    public void placeMyShip(ProgramData data, ShipType[][] grid) { // instead of trying to call all those instances, make it an input to give you access to all the stuff
        int startCol = data.getCol();
        int startRow = data.getRow();
        int length = data.getBoatType().getLength();

        ShipType ship = data.getBoatType();
        ShipOrientation orientation = data.getOrientation();

        if (orientation == ShipOrientation.HORIZONTAL) {
            for (int col = startCol; col < startCol + length; col++) {
                grid[startRow][col] = ship;

            }// turns out needed to update input to be an Array type as well as update what the element would be to match type
        } else if (orientation == ShipOrientation.VERTICAL) {
            for (int row = startRow; row < startRow + length; row++) {
                grid[row][startCol] = ship;
            }
        }
    }
}
    // Can make this function return void because they would already have a grid at the same location in memory