package com.company;

public class ParseInt1 {
    public static void main(String[]args){
        String str="22 56 75 48";
        String sp[]=str.split(" ");
        System.out.println(sp[0]);
        System.out.println("--------------------");
        for(String i:sp){
            System.out.println(Integer.parseInt(i));
        }

    }
}
