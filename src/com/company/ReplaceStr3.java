package com.company;

public class ReplaceStr3 {
    public static void main(String[]args){
        String str = "oooooo-hhhh-oooooo";
        String NewStr=str.replace("hhhh","ssss");
        System.out.println(NewStr);
        NewStr=NewStr.replace("ssss","hhhh");
        System.out.println(NewStr);
    }
}
