package com.company;

public class ValueType {
    public static void main(String[]args){
        IntToFloat(5);
        FloatToInt(5.12f);//(F或f)表告知編譯器此為浮點數
        CharToStr('a');//雖然看起來還是字元，但其實已經轉換成字串了
        StrToChar("hrrdk");
        IntToStr(5);
        IntToAscii(65);
        StrToInt("12");
    }
    public static void IntToFloat(int value){
        float ChangeValue=(float)value;
        System.out.println(ChangeValue+"\n------------------\n");
    }
    public static void FloatToInt(float value){
        int ChangeValue = (int)value;
        System.out.println(ChangeValue+"\n------------------\n");
    }
    public static void CharToStr(char ch){
        String ChangeValue=ch+"";//將一個字元加上空白，內容還是原本字元中的文字，但是卻可以把型態轉換成字串
        System.out.println(ChangeValue+"\n------------------\n");
    }
    public static void StrToChar(String str){
        char[] ChangeValue = str.toCharArray();
        for(char i:ChangeValue){
            System.out.println("char value:"+i+"\n------------------\n");
        }
    }
    public static void IntToStr(int value){
        String ChangeValue=value+"";
        System.out.println(ChangeValue+"\n------------------\n");
    }
    public static void IntToAscii(int value){
        char ChangeValue=(char)value;
        System.out.println(ChangeValue+"\n------------------\n");
    }
    public static void StrToInt(String str){
        int ChangeValue=Integer.parseInt(str);
        System.out.println(ChangeValue+"\n------------------\n");
    }
}
