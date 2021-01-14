package com.artillery;

public class BattleField {
    private static final int SIZE = 10; // to keep this from being attached to object and potentially data intensive we use "static".
    // This means that this ia variable that holds it's own memory space that then determines the characteristics of all battlefields
    // "final" is the keyword telling java compiler that this variable is set and cannot be changed by anyone using this program
    public CellState[][] battleField; // declare array access specifier, type being declared (can be enum), brackets (array)
    public BattleField(){
       battleField = new CellState[SIZE][SIZE]; //'new' used whenever you want to allocate.. CellState is an enum (enums allow to use this as datatype)
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++) {
                battleField[row][col] = initiate(); //remember you must take the final step of designating a cell to be written
            }
        }

    } //no return type for constructor functions and name must be the exact same as class

    public CellState initiate(){
        return CellState.OPEN;
    } //for methods, access specifier, return type, method name

    public String toString() {
        String output = "  1 2 3 4 5 6 7 8 9 10";

        for (int row = 0, chr = 65; row < SIZE; row++, chr++) {
            output = output + '\n' + ((char)chr); // '' for single chars, "" for strings
            for (int col = 0; col < SIZE; col++) {
                output = output + ' ' + battleField[row][col].toString(); //calling a builtin function similar to python
            }
        }
        return output;
    }

}

// [][] an array of arrays, can be 10 columns with 10 rows, just make sure you're consistent