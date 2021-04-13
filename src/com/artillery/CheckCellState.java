package com.artillery;

public class CheckCellState {
    private CellState result; //we run the risk of unintentional reuse, must think about)

    public void checkState(GuessData guess, OutputAbstraction output){ //checks for condition and returns relevant cellstate
        CellState[][] field = guess.getField();
        int row = guess.getGuessRow();
        int col = guess.getGuessCol();

        if (field[row][col] == CellState.SHIP){
            result = CellState.HIT;
            output.printOut("That's a hit!");
        } else if ((field[row][col] == CellState.OPEN)){
            result = CellState.MISS;
            output.printOut("Target missed!");
        }

//        case OPEN -> "O";
//        case SHIP -> "B";
//        case HIT -> "X";
//        case MISS -> "M";
//        case SUNK -> "S";
    }


}
