package com.company;

/**
 * public char[] toCharArray()
 * 取得字串內各字元(字符)
 * 輸入(input):字串
 * 輸出(output):字元
 */
public class StringToChar {
    public static void main(String []args){
        String str="Hello Oh my gash";
        char [] CharTemp=str.toCharArray();
        System.out.print("Converted value to character array :\n\t");
        System.out.print(CharTemp);//將字串全部存入字元陣列
    }
}
