package com.artillery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// check out edged cases for too positive and too negative for horizontal and vertical

public class TestOutOfBoundsValidator {
    @Test
    public void Validate_OutOfBounds_ReturnsFalse(){
        ProgramData data = new ProgramData(0,9,ShipType.SUBMARINE,ShipOrientation.HORIZONTAL);
        OutOfBoundsChecker isValid = new OutOfBoundsChecker();
        ShipType[][] grid = buildGrid(5, ShipType.OPEN);

        boolean result = isValid.validate(data,grid);
        Assertions.assertFalse(result);
    }
    @Test
    public void Validate_IsInBounds_ReturnTrue(){
        ProgramData data = new ProgramData(0,0,ShipType.SUBMARINE,ShipOrientation.HORIZONTAL);
        OutOfBoundsChecker isValid = new OutOfBoundsChecker();
        ShipType[][] grid = buildGrid(5, ShipType.OPEN);

        boolean result = isValid.validate(data,grid);
        Assertions.assertTrue(result);
    }

    private ShipType[][] buildGrid(int size, ShipType defaultShip){
        ShipType[][] grid = new ShipType[size][size];

        for (int row = 0; row < size; row++){
            for (int col =0; col < size; col ++){
                grid[row][col] = defaultShip;
            }
        }
        return grid;
    }
}
