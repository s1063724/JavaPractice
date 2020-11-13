package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * scanner的各種應用
 * java.util.Scanner.hasNext(Pattern pattern)
 * pattern(模式)-判斷前綴或後綴是否相同(相同true,不同false)
 */
public class Sc1 {
    public static void main(String[] args) {
        String str="Are u 87 ma~~~~\tlol\n8 87.87 98.3";
        Scanner sc =new Scanner(str);
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.nextLine());//輸出直至換行
        System.out.println(sc.nextDouble());//將下一個掃描到的整數或浮點數以浮點數輸出(若掃描到非數字，則出現error)
        System.out.println(sc.hasNext());//僅判斷是否還有未讀取的字符(True or False),不會跳至下一個字符(讀取點)
        String str1="tk8888\tare you hello?";
        Scanner sc1=new Scanner(str1);
        System.out.println(sc1.hasNext(Pattern.compile("tk88..")));//判斷下一個讀取點的前綴或後綴是否相同(pattern要夠長才能判斷)
        System.out.println(sc1.hasNext(Pattern.compile("..8888")));
        System.out.println(sc1.hasNext(Pattern.compile("..llo?")));

        sc.close();

    }
}
