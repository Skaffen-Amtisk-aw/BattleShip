package com.artillery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
/**  This class handles setting up of a buffered reader and will
 *   spit out any prompt you give it
 */
    public static String readLine(String prompt){
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
