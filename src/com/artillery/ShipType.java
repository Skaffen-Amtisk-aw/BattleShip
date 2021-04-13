package com.artillery;

public enum ShipType {
        CARRIER, BATTLESHIP, CRUISER, SUBMARINE, DESTROYER, OPEN;
    public int getLength() { //convention for getter (retrieval) functions start with "get", setter functions use "set"
        return switch (this) {
            case CARRIER -> 5;
            case BATTLESHIP -> 4;
            // removed return under CRUISER as both values are 3, so only need one return statement as long as they are right on top of each other
            case CRUISER, SUBMARINE -> 3;
            case DESTROYER -> 2;
            case OPEN -> 0; //**** added to allow shipgrid to be initialize with no initial ship value
        };
    }

    public String shipID() {
        return switch (this) {
            case DESTROYER -> "DE";
            case CRUISER -> "CR";
            case SUBMARINE -> "SU";
            case BATTLESHIP -> "BA";
            case CARRIER -> "CA";
            case OPEN -> "O ";
        };
    }

    public String toString() {

        return switch (this) {

            case CARRIER -> "CARRIER";
            case BATTLESHIP -> "BATTLESHIP";
            case CRUISER -> "CRUISER";
            case SUBMARINE -> "SUBMARINE";
            case DESTROYER -> "DESTROYER";
            case OPEN -> "OPEN";
            };
        }


    }

