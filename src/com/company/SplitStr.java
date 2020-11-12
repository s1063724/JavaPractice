package com.company;

/**
 * 分割字串
 * 分割會進行完全，分割形成的字符串数组長度無限制，對於末尾分隔符全部忽略，相當於stringInstance.split(String regex, 0);
 */
public class SplitStr {
    public static void main(String []args){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
    }
}
