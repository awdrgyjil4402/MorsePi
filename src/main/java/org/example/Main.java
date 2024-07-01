package org.example;

import org.example.MorseCode;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.gpio.digital.DigitalOutput;

import javax.print.attribute.standard.PrinterInfo;

public class Main {

    static int PIN_LED = 22;

    static String InputString = "sos";
    static int length = InputString.length();

    public static void main(String[] args) throws InterruptedException {
        Context pi4j = Pi4J.newAutoContext();

        DigitalOutput led = pi4j.digitalOutput().create(PIN_LED);
        Main main = new Main();

        MorseCode morseCode = new MorseCode(InputString);
        String OutputString = morseCode.Encode();
        char[] OutputArray = OutputString.toCharArray();
        int OutputArrayLength = OutputString.length();

        for (int i = 0; i < OutputArrayLength; i ++) {
            if (OutputArray[i] == '.') {
                led.high();
                Thread.sleep(1000);
                led.low();
            }
            if (OutputArray[i] == '-') {
                led.high();
                Thread.sleep(3000);
                led.low();
            }
            if (OutputArray[i] == '/') {
                Thread.sleep(2000);
            }
            if (OutputArray[i] == ' ') {
                Thread.sleep(6000);
            }
            Thread.sleep(1000);
        }
        pi4j.shutdown();
    }
}