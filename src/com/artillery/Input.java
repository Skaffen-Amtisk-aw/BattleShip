package com.artillery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input implements InputAbstraction { //using this input abstraction
    public String readIn(String prompt){
        System.out.println(prompt);
        System.out.println("Press the Enter key when done");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch(IOException ignored){ //suggested by the editor
            return "";
        }
        // Is this how it's done?

    }
}

// For dependency injection we do not want class to be static
// Calling this in RowCol into constructor
// No longer need Buffered reader class if we do it this way
// Making a class that depends on an idea instead of a specific input is called Abstraction
// Make sure to go back to input and see how it's used in RowCol,
// Then understand why input can be used in a variety of scenarios, it's really
// Further abstraction can be achieved thru use of an interface