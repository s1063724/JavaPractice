package com.company;

public class Convert {
    public static void main(String[] args)  {
        asciiToString();// ASCII轉換為字串

        stringToAscii();// 字串轉換為ASCII碼

    }

    public static void asciiToString() {// ASCII轉換為字串

        String s = "22307 35806 24555 20048";// ASCII碼

        String[] chars = s.split(" ");
        System.out.println("ASCII 漢字 \n----------------------");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + " "
                    + (char) Integer.parseInt(chars[i]));
        }
    }

    public static void stringToAscii() {// 字串轉換為ASCII碼

        String s = "你好中國!";// 字串

        char[] chars = s.toCharArray(); // 把字元中轉換為字元陣列

        System.out.println("\n\n漢字 ASCII\n----------------------");
        for (int i = 0; i < chars.length; i++) {// 輸出結果

            System.out.println(" " + chars[i] + " " + (int) chars[i]);
        }
    }
}