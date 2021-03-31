package com.artillery;

public interface InputAbstraction { // a convention seen around is to have I in front of interface class, unsure if convention is universal

    // The below function takes a string in and returns a string
    String readIn (String prompt); // THIS is our contract, everything that implements this interface has to function named readIn

}
    // look at Input class to see interface implementation

// Remember, interfaces do not have access modifiers on their methods
// We just want to make sure that whoever implements this interface makes sure they follow the rules
// What that looks like here is the interface takes a string in and gives a string out
