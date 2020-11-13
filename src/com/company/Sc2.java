package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * java.util.Scanner.hasNext(String pattern)
 */
public class Sc2 {
    public static void main(String[] args) {

        String s = "Hello World! 3+3.0=6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // check if the scanner's next token matches "World"
        System.out.println("" + scanner.hasNext("World"));

        // check if the scanner's next token matches "Hello"
        System.out.println("" + scanner.hasNext("Hello"));

        // print the rest of the string
        System.out.println("" + scanner.nextLine());

        // close the scanner
        scanner.close();
    }
}
