package com.artillery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; //compiler just downloaded this unit test for you
// [UnitOfWork_StateUnderTest_ExpectedBehavior] a good way to name tests for future
public class TestOverlapValidator {
    @Test
    public void Validate_Overlap_ReturnsFalse(){ //invoke overlap validator, have scenario with overlap condition, want solution to be false
        ProgramData data = new ProgramData(0,0,ShipType.SUBMARINE,ShipOrientation.HORIZONTAL);
        OverlapValidator isValid = new OverlapValidator();
        ShipType[][] grid = buildGrid(5, ShipType.CARRIER);

        boolean result = isValid.validate(data,grid);
        Assertions.assertFalse(result);
    }
    @Test
    public void Validate_Noverlap_ReturnsTrue(){
        ProgramData data = new ProgramData(0,0,ShipType.SUBMARINE,ShipOrientation.HORIZONTAL);
        OverlapValidator isValid = new OverlapValidator();
        ShipType[][] grid = buildGrid(5, ShipType.OPEN);

        boolean result = isValid.validate(data,grid);
        Assertions.assertTrue(result);
    }

    @Test
    public void Validate_OutOfBounds_ThrowsError(){
        ProgramData data = new ProgramData(0,9,ShipType.SUBMARINE,ShipOrientation.HORIZONTAL);
        OverlapValidator isValid = new OverlapValidator();
        ShipType[][] grid = buildGrid(5, ShipType.OPEN);


        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> { // syntax of assertthrows expected error type, and anonymous function we are tryna run
            isValid.validate(data,grid); // expecting this line to throw thus this is the only thing we need
        });
    }

    // Make sure to include the weird cases! Just because we have an out of bounds validator, doesn't mean we shouldn't see what happens in this function here

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
