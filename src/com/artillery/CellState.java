package com.artillery;
// enum allows you to have a cell have these states listed below
// comp will interp as numbers, humans can use readable format
// this will constrain the input to 5 possibilities
// better than treating as straight open character as this prevents unexpected inputs without error

//toString function getting really complex and also i think i'd be forcing it to only be used in unique instances

public enum CellState {

    OPEN, HIT, MISS, SUNK;


    public String toString() {

        return switch (this) {

            case OPEN -> "O";
            case HIT -> "H";
            case MISS -> "M";
            case SUNK -> "S";
//Update to other parts of program required, this is OK
        };
    }

    // return state; //compiler yelled at me about missing return statement again. Is this a side effect of using switch??
}

//        if (this == OPEN) { //"this" is a keyword akin to "self" in python
//            return "O";
//        }
//        else if (this == BATTLESHIP){
//            String quidEst = battleParse(this, )
//        }
//        else if (this == HIT){
//            return "H";
//        }
//        else if (this == MISS){
//            return "M";
//        }
//        else if (this == SUNK){
//            return "S";
//        }
//        else {
//            return "INVALID";
//        }
//    }// Nextercise, look into switch statements and use that instead of "if..else"
// }

