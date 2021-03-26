package com.artillery;

import java.io.*;
import java.lang.*;

public class ShipPlacement {


    private ShipType[] shipLib; // use ShipType instead of string to help prevent unexpected inputs (i.e. someone putting in "squash")
    private int libLength;
    private ShipType chosenShip;





    public ShipPlacement() { // THIS IS A CONSTRUCTOR
        shipLib = new ShipType[5]; // [null(x5)] is this array in memory
        shipLib[0] = ShipType.CARRIER;
        shipLib[1] = ShipType.BATTLESHIP;
        shipLib[2] = ShipType.CRUISER;
        shipLib[3] = ShipType.SUBMARINE;
        shipLib[4] = ShipType.DESTROYER;


        libLength = shipLib.length;

    }

    public ShipType initiate() {
        return ShipType.OPEN;
    } //function to initiate shipGrid with "Open" Cell

    public void printRemainingShips() {
        for (int i = 0; i < 5; i++) {
            if (shipLib[i] != null) {
                String output = shipLib[i].toString();
                System.out.println("You have a " + output + " remaining "); //print the array element
            }
        }           //iterate through every array element

    }
    // chosenShip = AskShip.askUserShip(); // should i call this as a constructor??
    public void askUserShip(){

        String userOutput = BufferedReaderClass.readLine("What is the ship you want to place?");

        while (true) {
            userOutput = userOutput.toUpperCase(); //to not pay attention to case
            try {
                chosenShip = ShipType.valueOf(userOutput);// will throw illegal arg exception if input misspelled without any preventative loops
                return;
            } catch (IllegalArgumentException except) {
                System.out.println("Please enter the ship type you'd like to place");
            }
        }  // updated line 19 to actually initialize output as compiler complains

    }

    public void keepTrack(ShipType shipType) { // This Function will update the shiplib array based on output from askUser function
        for (int i = 0; i < shipLib.length; i++) { // for each loop ==> can interp ":" as "in"
            if (shipType == shipLib[i]) {
                shipLib[i] = null;
                libLength--; // since this is attached to class instance, no need to return out of this function
            }
        }
    }

    public boolean allBoatsPlaced() {
        return libLength == 0; // instead of if else ==> gave it specific input, don;t think it will fix anything
    }

    public boolean validPlace(ProgramData data, ShipType[][] grid) { // don't need this to return anything as cellstate array is attached to BS class
        //this function will take user input and convert it to ... i need the return type to be CellState so i can slap it into the array right??
        // take user location input e,g, H6 and return a cell state with corresponding array location e.e. Cellstate [H as int] [6]

            PositionValidator[] validators = new PositionValidator[2]; // can use this interface array instead of multiple && conditions in if statement. We would not be able to use this without an interface
            validators[0] = new OverlapValidator();
            validators[1] = new OutOfBoundsChecker();
            boolean isInvalid = false;
// Update loop to 1. ask for all info again, and 2. do it in a way that makes sense (is there a way to package validators and program data together in discrete loop? maybe on main?
            for (PositionValidator validator: validators){ // this is "for each" loop, for (<each element> : <designated innumerable object>)
                if (!validator.validate(data, grid)){
                    System.out.println("Ship placement invalid, please choose a different orientation");

                    isInvalid = true;

                     // used instead of continue as we need to exit the for loop to have any hope of getting to the while loop ("continue" down below)
                }

            }
            return isInvalid;
        }
//          constructor for Program Data will go here somewhere ==> we should have all info needed to not get any nullpointerexceptions

//            if ((col + boatLength > BattleField.getSIZE()) || (row + boatLength > BattleField.getSIZE())) {
//                System.out.println("Plz enter a valid placement for this ship as " + userOutput + " orientation is out of bounds.");
//                userOutput = null;

    }










