package com.artillery;
// enum allows you to have a cell have these states listed below
// comp will interp as numbers, humans can use readable format
// this will constrain the input to 5 possibilities
// better than treating as straight open character as this prevents unexpected inputs without error
public enum CellState {

    OPEN, BATTLESHIP, HIT, MISS, SUNK;

    public String toString(){
        if (this == OPEN) { //"this" is a keyword akin to "self" in python
            return "O";
        }
        else if (this == BATTLESHIP){
            return "B";
        }
        else if (this == HIT){
            return "H";
        }
        else if (this == MISS){
            return "M";
        }
        else {
            return "S";
        }
    }
} // Nextercise, look into switch statements and use that instead of "if..else"

