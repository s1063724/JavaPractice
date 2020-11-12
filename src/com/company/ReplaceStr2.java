package com.company;

/**
 * 將"有序的字元"置換成欲"更換的有序字元"
 */
public class ReplaceStr2 {
    public static void main(String[]args){
        String s1="my name is khan my name is java";
        String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }
}
