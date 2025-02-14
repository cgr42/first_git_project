package mustafa;

import java.util.ArrayList;
import java.util.Collections;

public class Task05_FrequencyOfCharacters {

/*
        Write a return method that can find the frequency of characters
         Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */


    public static void main(String[] args) {

        String result=frequencyChar("AAABB CDD" );
        System.out.println(result);}


    /**
     * A String method for counting the characters in a string
     * that how many times they repeat
     * @param input String
     * @return output
     */
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
