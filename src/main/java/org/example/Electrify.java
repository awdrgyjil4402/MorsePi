package org.example;

import com.pi4j.context.Context;
import com.pi4j.io.gpio.digital.DigitalOutput;

public class Electrify {
    private Context context;
    private static int PIN_LED = 22;
    public Electrify (Context context) {
        this.context = context;
    }
    public void control(char[] outputArray) throws InterruptedException {
        DigitalOutput led = context.digitalOutput().create(PIN_LED);
        for (char c : outputArray) {
            if (c == '.') {
                led.high();
                Thread.sleep(500);
                led.low();
            }
            if (c == '-') {
                led.high();
                Thread.sleep(1500);
                led.low();
            }
            if (c == '/') {
                Thread.sleep(1000);
            }
            if (c == ' ') {
                Thread.sleep(3000);
            }
            Thread.sleep(500);
        }
    }
}

