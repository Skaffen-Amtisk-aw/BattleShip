package com.artillery;

public interface Validator { //Interface does not hold any code, only has methods that are defined in other places

    boolean validate(ProgramData data, ShipType[][] grid); // now that we've made a program data class, we can pass in two args (ProgramData, grid)
}

// This a "contract" still need a class method to follow the rules of the contract
