package com.company;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a number: ");
        System.out.printf("Oh! I get %d!!\n", sc.nextInt());
        String s1 = sc.next();
        System.out.println(s1);
        System.out.println("請輸入三個數字(以空白鍵或Tab鍵分開)：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("您輸入第一個數字為：" + num1 );
        System.out.println("您輸入第二個數字為：" + num2 );
        System.out.println("您輸入第三個數字為：" + num3 );

    }

}
