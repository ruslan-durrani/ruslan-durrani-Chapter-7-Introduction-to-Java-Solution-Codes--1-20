package Russi7kd;



import java.util.*;



public class Case_Study_Random_Family {

    public static void main(String[] args) {

        // Declare and create an array

        char[] chars = createArray('a');

        // Display the array For Lower Case

        System.out.println("The lowercase letters are:");

        //Display array for lower case letters

        displayArray(chars);

        // Count the occurrences of each letter

        int[] counts = countLetters(chars, 'a');

        // Display counts

        System.out.println();

        System.out.println("The occurrences of small letters are:");

        displayCounts(counts,'a');



        System.out.println("\n======================================");

        // Declare and create an array for Upper Case

        char[] charsUpper = createArray('A');



        // Display the array for Upper Case Letter

        System.out.println("\nThe Uppercase letters are:");

        displayArray(charsUpper);

        // Count the occurrences of each letter

        int[] countUpper = countLetters(charsUpper , 'A');

        // Display counts

        System.out.println();

        System.out.println("The occurrences of capital letters are:");

        displayCounts(countUpper,'A');



        System.out.println("\n======================================");

        // Declare and create an array for Digits

        char[] charsDigits = createArray('0');

        // Display the array

        System.out.println("\nThe random Digits are:");

        displayArray(charsDigits);

        // Count the occurrences of each letter

        int[] countDigits = countLetters(charsDigits , '0');

        // Display counts

        System.out.println();

        System.out.println("The occurrences of digits are:");

        displayCounts(countDigits,'0');

    }



    /** Create an array of characters */

    public static char[] createArray(char a) {

        // Declare an array of characters and create it

        char[] nullList = new char[10];

        char[] charsLower = new char[100];

        char[] charsUpper = new char[100];

        char[] charsDigits = new char[100];



        // Create lowercase letters randomly and assign

        // them to the array

        if (a == 'a'){

            for (int i = 0; i < charsLower.length; i++)

                charsLower[i] = randomCharacterLower();

            return charsLower;

        }

        if (a == 'A'){

            for (int i = 0; i < charsUpper.length; i++)

                charsUpper[i] = randomCharacterUpper();

            return charsUpper;

        }

        if (a == '0'){

            for (int i = 0; i < charsUpper.length; i++) {

                charsDigits[i] = randomNumber();

//                System.out.println(charsUpper[i]);

            }

            return charsDigits;

        }

        return nullList;

    }

    /** Display the array of characters */

    public static void displayArray(char[] chars) {

        // Display the characters in the array 20 on each line

        for (int i = 0; i < chars.length; i++) {

            if ((i + 1) % 20 == 0)

                System.out.println(chars[i]);

            else

                System.out.print(chars[i] + " ");

        }

    }



    /** Count the occurrences of each letter */

    public static int[] countLetters(char[] chars , char s) {

        // Declare and create an array of 26 int

        int[] nullList = new int[10];

        int[] countsLower = new int[26];

        int[] countsUpper = new int[26];

        int[] countsDigits = new int[10];



        // For each lowercase letter in the array, count it

        if(s == 'a'){

            for (int i = 0; i < chars.length; i++)

                countsLower[chars[i] - 'a']++;

            return countsLower;

        }

        // For each uppercase letter in the array, count it

        else if (s == 'A'){

            for (int i = 0; i < chars.length; i++)

                countsUpper[chars[i] - 'A']++;

            return countsUpper;

        }

        // For each digit letter in the array, count it

        else if (s == '0'){

            for (int i = 0; i < chars.length; i++)

                countsDigits[chars[i] - '0']++;

            return countsDigits;

        }



        return nullList;

    }

    /** Display counts Family*/

    public static void displayCounts(int[] counts , char a) {

        if(a == 'a')

            for (int i = 0; i < counts.length; i++) {

                if ((i + 1) % 10 == 0)

                    System.out.println(counts[i] + " " + (char)(i + 'a'));

                else

                    System.out.print(counts[i] + " " + (char)(i + 'a') + " ");

            }

        if(a == 'A')

            for (int i = 0; i < counts.length; i++) {

                if ((i + 1) % 10 == 0)

                    System.out.println(counts[i] + " " + (char)(i + 'A'));

                else

                    System.out.print(counts[i] + " " + (char)(i + 'A') + " ");

            }

        if(a == '0')

            for (int i = 0; i < counts.length; i++) {

                if ((i + 1) % 4 == 0)

                    System.out.println(counts[i] + " times " + (char)(i + '0'));

                else

                    System.out.print(counts[i] + " times " + (char)(i + '0') + " , ");

            }

    }



    // Random Methods Family============================

    public static char random(char ch1, char ch2){

        return  (char)(ch1 + Math.random() * ( ch2 - ch1 + 1));

    }

    public static char randomNumber() {

        return  random('0','9');



    }

    public static char randomCharacterUpper(){

        return  random('A','Z');

    }

    public static char randomCharacterLower(){

        return  random('a','z');

    }

}