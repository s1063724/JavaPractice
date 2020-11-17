package com.company;

import java.nio.charset.StandardCharsets;

/**
 * CharToAscII(char ch)
 * set x value inside to CharToAscII(char ch) method
 */
public class CharConvertAscII {
    public static void main(String[]args){
        char x='D';
        CharToAscII(x);
        String a="adads";
        CharToAscII1(a,3);
    }
    public static void CharToAscII(char ch){
        int AsciiValue=ch;
        System.out.print("AscII Numeric Value: "+AsciiValue+"\n-----------------------------\n");
    }
    public static void CharToAscII1(String s,int i){
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println("ASCII Numeric Value: "+bytes[i]+"\n-----------------------------\n");
    }

}
