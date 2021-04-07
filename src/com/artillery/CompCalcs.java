package com.artillery;


public class CompCalcs implements RandomNumberInterface {

    public int makeRandomNumber(int max) { //makes random number from 0 to max
        double doubleRandomNumber = Math.random() * max;
        // cast the double to whole number
        return (int)doubleRandomNumber;
    }
}
