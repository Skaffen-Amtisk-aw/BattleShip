package com.artillery;

public class OutOfBoundsChecker implements PositionValidator {
    @Override

    public boolean validate(ProgramData data, ShipType[][] grid) {
        // ProgramData data = new ProgramData(); this will not work, remember "new" is materializing stuff out of thin air

        int startCol = data.getCol();
        int startRow = data.getRow();
        int length = data.getBoatType().getLength();
        int size = BattleField.getSIZE();
        ShipOrientation orientation = data.getOrientation();


        if (data.getOrientation() == ShipOrientation.HORIZONTAL) { // compiler asked to use .equals() <== operates on object as == will only look at the memory location of non-built in types
            return startCol + length < size;

        } else if (orientation == ShipOrientation.VERTICAL) {
            return startRow + length < size;

        } else {
            return true;
        }
    }
}
