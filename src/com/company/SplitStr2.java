package com.company;

/**
 * 切割字元
 * regex - 分隔正規表示式。
 * limit - 結果閾值，表示要返回的字串數。(空白數也會影響返回)(分割成幾段)
 */
public class SplitStr2 {
    public static void main(String[]args){
        String s="dmksdgmdklgmdrl;";
        String []arr=s.split("m",0);//將字串存入array內
        System.out.println("return:");
        for (String w:arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: "+arr.length);
        System.out.println("-------------------------------------");
        arr=s.split("d");
        System.out.println("return:");
        for (String w:arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: "+arr.length);
        System.out.println("-------------------------------------");
        arr=s.split("d",1);
        System.out.println("return:");
        for (String w:arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: "+arr.length);
        System.out.println("-------------------------------------");
        arr=s.split("d",2);
        System.out.println("return:");
        for (String w:arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: "+arr.length);
        System.out.println("-------------------------------------");
        arr=s.split("m",3);
        System.out.println("return:");
        for (String w:arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: "+arr.length);
    }
}
