package org.example;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;

/*
Todo:
 - FIRST LETTER IN VARIABLE NAME MUST BE LOWERCASE
 - Put the Morse-Pi code in a new class - the app class should only run other methods
*/

public class MorseCodeApp {

    public static void main(String[] args) throws InterruptedException {
        String inputString = args[0];
        System.out.println(inputString);

        Context context = Pi4J.newAutoContext();


        MorseCode morseCode = new MorseCode();
        Electrify electrify = new Electrify(context);
        String outputString = morseCode.Encode(inputString);

        char[] outputArray = outputString.toCharArray();
        electrify.control(outputArray);
        context.shutdown();
    }
}