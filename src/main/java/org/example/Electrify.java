package org.example;

public class Electrify {
    public void Encode(char[] OutputArray, int OutputArrayLength) throws InterruptedException {
        for (int i = 0; i < OutputArrayLength; i++) {
            if (OutputArray[i] == '.') {
                led.high();
                Thread.sleep(500);
                led.low();
            }
            if (OutputArray[i] == '-') {
                led.high();
                Thread.sleep(1500);
                led.low();
            }
            if (OutputArray[i] == '/') {
                Thread.sleep(1000);
            }
            if (OutputArray[i] == ' ') {
                Thread.sleep(3000);
            }
            Thread.sleep(500);
        }
    }
}

