package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 12, b = 8, c = 6;
        System.out.println(a+ " "+ b + " "+ c );//12 8 6
        a = c; //a = 6
        System.out.println(a+ " "+ b + " "+ c );//6 8 6
        c += 8;
        System.out.println(a+ " "+ b + " "+ c );//6 8 14
        a = b + c;
        System.out.println(a+ " "+ b + " "+ c );//22 8 14
        a++;//22 23
        ++b;//9
        System.out.println(a+ " "+ b + " "+ c );
        c = a++ + ++b;//c=23+10
        System.out.println(a+ " "+ b + " "+ c );//24 10 33
    }
}
