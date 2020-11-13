package com.company;

/**
 * static int parseInt(String s)
 * static int parseInt(String s, int radix)
 * parameter:
 * s − This is a string representation(表示) of decimal(十進制).
 * radix(基數) − This would be used to convert(轉換) String s into integer(整數).
 * return:
 * parseInt(String s) − This returns an integer (decimal only).
 * parseInt(int i) − This returns an integer, given a string representation(分別) of decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.
 */
public class Parseint {
    public static void main(String[]args){
        int x=Integer.parseInt("9");
        double y=Double.parseDouble("5");
        int z=Integer.parseInt("444",16);//10進制(Decimal)轉成16進制(Hex)
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
