package com.artillery;

public class Main {

    public static void main(String[] args) {
	    BattleField grid = new BattleField(); //calling constructor here, must say "new" for java remember to denote data type before variable name
        System.out.println(grid); // every object has a toString method, we just commandeered it so we can give our grid representation in this case
    }

}
