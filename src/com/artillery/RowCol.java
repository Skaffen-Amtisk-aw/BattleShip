package com.artillery;

//This class will determine and hold
public class RowCol {
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    private int row;
    private int column;


    public void getRowCol(InputAbstraction input, OutputAbstraction output) { //Changed from Input to InputAbstraction datatype, went from specific to vague
        //this function will take user input and convert it to ... i need the return type to be CellState so i can slap it into the array right??
        // take user location input e,g, H6 and return a cell state with corresponding array location e.e. Cellstate [H as int] [6]
        String unverifiedOutput; //trying this


        while (true) {

            unverifiedOutput = input //dependency injection
                    .readIn("Where do you want to place this ship? Enter a letter A-J followed by a number 1-10") // you can do fun things with format
                    .toUpperCase();

            char gridLetter = unverifiedOutput.charAt(0); // function that grabs char at specific index within string

            if ('A' <= gridLetter && gridLetter <= 'J') { // converting Row letter to a number
                row = gridLetter - 65; // converting to ASCII and zeroing (A begins at 65)
            } else {
                output.printOut("Plz enter letter A thru J.");
                continue; // Will skip past everything and restart the loop
            }

            String stringColNum = unverifiedOutput.substring(1); // grabbing characters starting from index 1
            int col = Integer.parseInt(stringColNum); // converting stringy to inty
            if (1 <= col && col <= 10) {
                column = col - 1; // added -1 due to column shift
                break;
            } else {
                output.printOut("Plz enter number 1 thru 10."); //OK??
            }

//            if (grid[row][column] != ShipType.OPEN){  // We made a class that handles checking for overlaps
//                System.out.println("A ship already occupies this space, please enter a different coordinate");
//                userOutput = null;
        }

    }

    public void compRowCol(int numRow, int numCol){
        row = numRow;
        column = numCol;

    }

    public String toString() {
        return "Row is " + row + ". Column is " + column; // is actually a viable technique
    }
}

