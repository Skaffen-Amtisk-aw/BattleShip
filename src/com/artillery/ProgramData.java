package com.artillery;

public class ProgramData {
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public ShipType getBoatType() {
        return boatType;
    }

    public ShipOrientation getOrientation() {
        return orientation;
    }

    //integers
    private int row;
    private int col;
    private ShipType boatType;
    private ShipOrientation orientation;


    //game objects


    public ProgramData(int row, int col, ShipType boatType, ShipOrientation orientation){
        this.row = row;
        this.col = col;
        this.boatType = boatType;
        this.orientation = orientation;

            }
    }

