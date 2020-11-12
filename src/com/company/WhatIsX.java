package com.company;

import java.awt.*;

public class WhatIsX {
    public static void f(int x){
        /*unknow*/
    }
    public static void main(String[]args){
        /*
        int x=0;
        f(x);
        System.out.println(x);//0
        */
        String str="hello";
        String sub=str.substring(2,4);
        System.out.println(sub);
        IntegerToString();

    }
    public static void IntegerToString(){
        int x=Integer.parseInt("75");
        double y=Double.valueOf("3.14").doubleValue();
        System.out.println(x);
        System.out.println(y);
    }

}
