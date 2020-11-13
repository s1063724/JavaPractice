package com.company;

public class ParseInt2 {
    public static void main(String[]args){
        String str="22 56 75 48";
        String sp[]=str.split(" ");
        int arr[]=new int[4];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sp[i]);
            System.out.println(arr[i]);
        }

    }
}
