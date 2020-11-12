package com.company;

public class Pratice {
    public static void main(String [] args){
        int b=5,c=5;
        int a=b++ +  c++;
        System.out.println(a);
        a=b++ + ++c;
        System.out.println(a);
        a=++b +c++;
        System.out.println(a);
        a=++b + ++c;
        System.out.println(a);
    }
}
