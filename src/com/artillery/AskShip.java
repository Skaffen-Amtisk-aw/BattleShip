package com.artillery;


public class AskShip {
    public ShipType askUserShip(){
        ShipType chosenShip;

        String userOutput = BufferedReaderClass.readLine("What is the ship you want to place?");

        while (true) {
            userOutput = userOutput.toUpperCase(); //to not pay attention to case
            try {
                chosenShip = ShipType.valueOf(userOutput);// will throw illegal arg exception if input misspelled without any preventative loops
                return chosenShip;
            } catch (IllegalArgumentException except) {
                System.out.println("Please enter the ship type you'd like to place");
            }
        }  // updated line 19 to actually initialize output as compiler complains

    }

}