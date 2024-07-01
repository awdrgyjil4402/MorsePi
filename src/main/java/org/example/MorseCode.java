package org.example;

import java.util.ArrayList;

public class MorseCode {
    private int length;
    private char[] InputArray;


    public MorseCode (String input) {
        length = input.length();
        InputArray = input.toCharArray();
        System.out.println(length);
        System.out.println(InputArray);
    }
    public String Encode () {
        String output = "";
        for (int i = 0; i < length; i++) {
            if (Character.toLowerCase(InputArray[i]) == ' ') {
                output = output + " ";
            }
            if (Character.toLowerCase(InputArray[i]) == 'a') {
                output = output + ".-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'b') {
                output = output + "-...";
            }
            if (Character.toLowerCase(InputArray[i]) == 'c') {
                output = output + "-.-.";
            }
            if (Character.toLowerCase(InputArray[i]) == 'd') {
                output = output + "-..";
            }
            if (Character.toLowerCase(InputArray[i]) == 'e') {
                output = output + ".";
            }
            if (Character.toLowerCase(InputArray[i]) == 'f') {
                output = output + "..-.";
            }
            if (Character.toLowerCase(InputArray[i]) == 'g') {
                output = output + "--.";
            }
            if (Character.toLowerCase(InputArray[i]) == 'h') {
                output = output + "....";
            }
            if (Character.toLowerCase(InputArray[i]) == 'i') {
                output = output + "..";
            }
            if (Character.toLowerCase(InputArray[i]) == 'j') {
                output = output + ".----";
            }
            if (Character.toLowerCase(InputArray[i]) == 'k') {
                output = output + "-.-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'l') {
                output = output + ".-..";
            }
            if (Character.toLowerCase(InputArray[i]) == 'm') {
                output = output + "--";
            }
            if (Character.toLowerCase(InputArray[i]) == 'n') {
                output = output + "-.";
            }
            if (Character.toLowerCase(InputArray[i]) == 'o') {
                output = output + "---";
            }
            if (Character.toLowerCase(InputArray[i]) == 'p') {
                output = output + ".--.";
            }
            if (Character.toLowerCase(InputArray[i]) == 'q') {
                output = output + "--.-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'r') {
                output = output + ".-.";
            }
            if (Character.toLowerCase(InputArray[i]) == 's') {
                output = output + "...";
            }
            if (Character.toLowerCase(InputArray[i]) == 't') {
                output = output + "-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'u') {
                output = output + "..-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'v') {
                output = output + "...-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'w') {
                output = output + ".--";
            }
            if (Character.toLowerCase(InputArray[i]) == 'x') {
                output = output + "-..-";
            }
            if (Character.toLowerCase(InputArray[i]) == 'y') {
                output = output + "-.--";
            }
            if (Character.toLowerCase(InputArray[i]) == 'z') {
                output = output + "--..";
            }
            output = output + "/";
        }
        return output;
    }
}