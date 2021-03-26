package com.artillery;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    BattleField grid = new BattleField(); //calling constructor here, must say "new" for java remember to denote data type before variable name
        ShipPlacement fleet = new ShipPlacement();
        AskShip chosenShip = new AskShip();
        ShipOrienting orient = new ShipOrienting();
        PlaceShip placement = new PlaceShip();
        ProgramData data;
        boolean isInvalid;



        System.out.println(grid.shipToString()); // every object has a toString method, we just commandeered it so we can give our grid representation in this case

        // The setup!!
        while ( !fleet.allBoatsPlaced() ){ // shiplib is now private, make sure to understand the reasoning behind why fields should almost always be private

            fleet.printRemainingShips();
            ShipType myShip = chosenShip.askUserShip();
            fleet.keepTrack(myShip);

            do{
                System.out.println(grid.shipToString());
                RowCol rowColumn = new RowCol();// Determine rows and column of ship start
                ShipOrientation orientation = orient.orientMyShip();
                data = new ProgramData(rowColumn.getRow(), rowColumn.getColumn() , myShip, orientation);
                isInvalid = fleet.validPlace(data, grid.shipGrid);
            } while (isInvalid);


            placement.placeMyShip(data, grid.shipGrid);

            System.out.println(grid.shipToString());



        }
    }

}
