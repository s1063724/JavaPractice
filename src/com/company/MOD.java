package com.company;

/**
 * public static int floorMod(data_type a, data_type b)
 */
public class MOD {
    public static void main(String[]args){
        int a = 25, b = 5;
        System.out.println(Math.floorMod(a, b));

        // Divisor and dividend is having same sign
        int c = 123, d = 50;
        System.out.println(Math.floorMod(c, d));

        // Divisor is having negative sign
        int e = 123, f = -50;
        System.out.println(Math.floorMod(e, f));

        // Dividend is having negative sign
        int g = -123, h = 50;
        System.out.println(Math.floorMod(g, h));
    }
}
