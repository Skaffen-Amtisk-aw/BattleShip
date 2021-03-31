package com.artillery;

import java.io.IOException;

public class ShipOrienting implements UserQuestion<ShipOrientation> { // compare to AskShip. We were able to use generics
    public ShipOrientation userInput() {
        ShipOrientation output = null;

        while (output == null) {
            String userOutput = BufferedReaderClass.readLine("Please specify 'horizontal' or 'vertical' for the ship orientation.").toUpperCase();
            try {
                output = ShipOrientation.valueOf(userOutput);
            } catch (IllegalArgumentException except) {
                System.out.println("Please enter either horizontal or vertical");
            }
        }
        return output;
    }
}
