package com.artillery;
//Must tell this class that we are trying to fulfill PositionValidator contract
public class OverlapValidator implements Validator {
    @Override
    public boolean validate(ProgramData data, ShipType[][] grid) {

        int startCol = data.getCol();
        int startRow = data.getRow();
        int length = data.getBoatType().getLength();
        int size = BattleField.getSIZE();
        ShipOrientation orientation = data.getOrientation();



        if (orientation.equals(ShipOrientation.HORIZONTAL)) { // compiler asked to use .equals() <== operates on object as == will only look at the memory location of non-built in types
            for (int c = startCol; c < startCol + length; c++) {
                if (c >= size) { // we added this to avoid making our Overlap Validator "fragile" that is, order dependent on OutofBounds checker
                    return true;
                }
                if (grid[startRow][c] != ShipType.OPEN) { // much more simple, you know an overlap if you encounter an occupied space
                    return false;
                }
            }

        } else if (orientation.equals(ShipOrientation.VERTICAL)) {
            for (int r = startRow; r < startRow + length; r++) {
                if (r >= size) {
                    return true;
                }
                if (grid[startCol][r] != ShipType.OPEN) {
                    return false;
                }
            }
        }
        return true;

    }
}