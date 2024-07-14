package org.example;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.gpio.digital.DigitalOutput;

/*
Todo:
 - FIRST LETTER IN VARIABLE NAME MUST BE LOWERCASE
 - Put the Morse-Pi code in a new class - the app class should only run other methods
*/

public class MorseCodeApp {

    static int PIN_LED = 22;


    public static void main(String[] args) throws InterruptedException {
        String inputString = args[0];
        System.out.println(inputString);

        Context pi4j = Pi4J.newAutoContext();
        DigitalOutput led = pi4j.digitalOutput().create(PIN_LED);

        MorseCode morseCode = new MorseCode();
        Electrify electrify = new Electrify();
        String OutputString = morseCode.Encode(inputString);
        char[] OutputArray = OutputString.toCharArray();
        int OutputArrayLength = OutputString.length();

        electrify.Encode(OutputArray, OutputArrayLength);
        pi4j.shutdown();
    }
}