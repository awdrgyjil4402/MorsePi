package org.example;

import java.util.ArrayList;

public class MorseCode {

    public String Encode (String input) {
        int length = input.length();
        char[] inputArray = input.toCharArray();
        System.out.println(length);
        System.out.println(inputArray);
        String output = "";
        for (int i = 0; i < length; i++) {
            if (Character.toLowerCase(inputArray[i]) == ' ') {
                output = output + " ";
            }
            if (Character.toLowerCase(inputArray[i]) == 'a') {
                output = output + ".-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'b') {
                output = output + "-...";
            }
            if (Character.toLowerCase(inputArray[i]) == 'c') {
                output = output + "-.-.";
            }
            if (Character.toLowerCase(inputArray[i]) == 'd') {
                output = output + "-..";
            }
            if (Character.toLowerCase(inputArray[i]) == 'e') {
                output = output + ".";
            }
            if (Character.toLowerCase(inputArray[i]) == 'f') {
                output = output + "..-.";
            }
            if (Character.toLowerCase(inputArray[i]) == 'g') {
                output = output + "--.";
            }
            if (Character.toLowerCase(inputArray[i]) == 'h') {
                output = output + "....";
            }
            if (Character.toLowerCase(inputArray[i]) == 'i') {
                output = output + "..";
            }
            if (Character.toLowerCase(inputArray[i]) == 'j') {
                output = output + ".----";
            }
            if (Character.toLowerCase(inputArray[i]) == 'k') {
                output = output + "-.-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'l') {
                output = output + ".-..";
            }
            if (Character.toLowerCase(inputArray[i]) == 'm') {
                output = output + "--";
            }
            if (Character.toLowerCase(inputArray[i]) == 'n') {
                output = output + "-.";
            }
            if (Character.toLowerCase(inputArray[i]) == 'o') {
                output = output + "---";
            }
            if (Character.toLowerCase(inputArray[i]) == 'p') {
                output = output + ".--.";
            }
            if (Character.toLowerCase(inputArray[i]) == 'q') {
                output = output + "--.-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'r') {
                output = output + ".-.";
            }
            if (Character.toLowerCase(inputArray[i]) == 's') {
                output = output + "...";
            }
            if (Character.toLowerCase(inputArray[i]) == 't') {
                output = output + "-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'u') {
                output = output + "..-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'v') {
                output = output + "...-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'w') {
                output = output + ".--";
            }
            if (Character.toLowerCase(inputArray[i]) == 'x') {
                output = output + "-..-";
            }
            if (Character.toLowerCase(inputArray[i]) == 'y') {
                output = output + "-.--";
            }
            if (Character.toLowerCase(inputArray[i]) == 'z') {
                output = output + "--..";
            }
            output = output + "/";
        }
        return output;
    }
}