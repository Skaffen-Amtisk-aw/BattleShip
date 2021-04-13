package com.artillery;

public class MakeGuess {

    private int guessRow;
    private int guessColumn;

    public int getGuessRow() {
        return guessRow;
    }

    public int getGuessColumn() {
        return guessColumn;
    }

    public void makeGuess(InputAbstraction input, OutputAbstraction output) {
        String unverifiedOutput;
// use rowcol
        while(true) {
            unverifiedOutput = input //dependency injection
                    .readIn("Choose a grid square where you want to direct fire") // you can do fun things with format
                    .toUpperCase();

            char gridLetter = unverifiedOutput.charAt(0); // function that grabs char at specific index within string

            if ('A' <= gridLetter && gridLetter <= 'J') { // converting Row letter to a number
                guessRow = gridLetter - 65; // converting to ASCII and zeroing (A begins at 65)
            } else {
                output.printOut("Plz enter letter A thru J.");
                continue; // Will skip past everything and restart the loop
            }

            String stringColNum = unverifiedOutput.substring(1); // grabbing characters starting from index 1
            int col = Integer.parseInt(stringColNum); // converting stringy to inty
            if (1 <= col && col <= 10) {
                guessColumn = col - 1; // added -1 due to column shift
                break;
            } else {
                output.printOut("Plz enter number 1 thru 10.");
            }
        }
    }
    public void compGuess(int row, int col){

    }
}
