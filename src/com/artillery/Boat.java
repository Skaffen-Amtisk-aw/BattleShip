package com.artillery;

public class Boat {

    public int boatLength;
    private ShipType boat;


    public String shipID() { // How to integrate??
        String abbreviation;

        switch (boatLength) {
            case 2:
                abbreviation = "DE";
                break;

            case 3:
                if (boat.equals(ShipType.CRUISER)) {
                    abbreviation = "CR";
                } else {
                    abbreviation = "SU";
                }
                break;

            case 4:
                abbreviation = "BA";
                break;
            case 5:
                abbreviation = "CA";
                break;

            default:
                abbreviation = "INVALID";

        }
        return abbreviation;
    }

    public String toString() {
        return "" + boatLength; // is actually a viable technique
    }

}
