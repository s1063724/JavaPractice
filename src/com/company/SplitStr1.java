package com.company;
/**
 * public String[] split(String regex, int limit)
 * regex - 分隔正規表示式。
 * limit - 結果閾值，表示要返回的字串數。(空白數也會影響返回)
 * 若欲返回字串數>分割字串數(i.e. limit>分割字串數)，則最後一格會返回空白
 */
public class SplitStr1 {
    public static void main(String[]args){
        String s="Are  you 87 ma?";
        System.out.println("returning words:");
        for(String w:s.split("\\s",0)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s.split("\\s",2)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s.split("\\s",3)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s.split("\\s",4)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s.split("\\s",5)){
            System.out.println(w);
        }
    }
}
