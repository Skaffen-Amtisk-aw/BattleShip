package com.artillery;

public class Main {
// Variable declaration should happen within the smallest scope (Read: curly brackets) possible
    public static void main(String[] args) {
	    BattleField userGrid = new BattleField();//calling constructor here, must say "new" for java remember to denote data type before variable name
        BattleField compGrid = new BattleField();

        ShipPlacement userFleet = new ShipPlacement();
        ShipPlacement compFleet = new ShipPlacement();




        ProgramData data;
        ProgramData compData;

        AskShip chosenShip = new AskShip();
        ShipOrienting orient = new ShipOrienting();
        PlaceShip placement = new PlaceShip();
        Input input = new Input();
        Output output = new Output();

        boolean isInvalid;

        //Computer section**********************************


        while (!compFleet.allBoatsPlaced() ){
            System.out.println("computer populates grid...");
            compFleet.printRemainingShips(); // Test to ensure comp does it all
            ShipType compShip;
            compShip = chosenShip.compChoose(compFleet.getShipLib());
            compFleet.keepTrack(compShip);

            do{

                RowCol compRowColumn = new RowCol();
                RandomNumberInterface compNumbers = new CompCalcs(); // compNumbers is now beholden to our interface we created through the "implements..." line in CompCalcs

                compRowColumn.compRowCol(compNumbers.makeRandomNumber(9), compNumbers.makeRandomNumber(9));
                ShipOrientation compOrientation = orient.CompShipOrientation();
                compData = new ProgramData(compRowColumn.getRow(), compRowColumn.getColumn(), compShip, compOrientation);
                isInvalid = compFleet.validPlace(compData, compGrid.shipGrid);

            } while(isInvalid);

            placement.placeMyShip(compData, compGrid.shipGrid);

            System.out.println(compGrid.shipToString());


        }

        System.out.println(userGrid.shipToString()); // every object has a toString method, we just commandeered it so we can give our grid representation in this case

        // The setup!!
        while ( !userFleet.allBoatsPlaced() ){ // shiplib is now private, make sure to understand the reasoning behind why fields should almost always be private

            userFleet.printRemainingShips();
            ShipType myShip = chosenShip.userInput();
            userFleet.keepTrack(myShip);

            do{
                RowCol userRowColumn = new RowCol();

                System.out.println(userGrid.shipToString());

                userRowColumn.getRowCol(input, output);// Determine rows and column of ship start
                ShipOrientation orientation = orient.userInput();
                data = new ProgramData(userRowColumn.getRow(), userRowColumn.getColumn() , myShip, orientation);
                isInvalid = userFleet.validPlace(data, userGrid.shipGrid);
            } while (isInvalid);


            placement.placeMyShip(data, userGrid.shipGrid);

            System.out.println(userGrid.shipToString());



        }

        //Guessing section
        MakeGuess newGuess = new MakeGuess();
        GuessData guess = new GuessData();

        newGuess.makeGuess(input,output);
        // Make guess ==> Guess Class? > called MakeGuess // is there a way to have make guess and RowCol class have overlap
        // Class or function that updates cellstate grid -> Cellstate Update
        // Check if ship is there or not or if square is already a MISS or a SUNK ==> Check grid class? -> CheckCellState
        // If ship is there, hit ==> Effect class
        // If ship is not there, miss ==> effect class
        // Check if ship is fully hit ==> verification?
        // change ship occupied space to sunk ==> effect class
    }

}
