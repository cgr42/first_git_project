package day01;

import java.util.ArrayList;
import java.util.Collections;

public class kjlkjl {

    public static void main(String[] args) {

String result=frequencyChar("AAABB CDD" );
System.out.println(result);
    }






    public static String frequencyChar(String input){

        ArrayList<Character> charList = new ArrayList<>();
        for (char each: input.toCharArray()) {
            charList.add(each);}


        String output = "";
        for (int i = 0; i < input.length(); i++) {
        char currentChar = input.charAt(i);

        if (currentChar == ' ') {
                continue;}

        else if (output.indexOf(currentChar) == -1) {
            int frequency = Collections.frequency(charList, currentChar);
            output =output+ currentChar + "" + frequency;
        }}

        return output;
    }}
