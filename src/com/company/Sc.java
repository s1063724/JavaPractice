package com.company;
import java.util.Scanner;

/**
 * 判斷是否有文字
 */
public class Sc {
    public static void main(String[]args){
        String s = "Hello World! 3+3.0=6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // check if the scanner has a token
        System.out.println("" + scanner.hasNext());

        // print the rest of the string
        System.out.println("" + scanner.nextLine());

        // check if the scanner has a token after printing the line
        System.out.println("" + scanner.hasNext());

        // close the scanner
        scanner.close();
    }
}
