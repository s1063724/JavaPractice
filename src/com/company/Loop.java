package com.company;

public class Loop {
    public static void main(String[] args){
        //SumEqualProduct(0,0);
        int a=3;
        int b=7;
        System.out.println(min(a,b));

    }
    public static int min(int x,int y){
        return x < y ? x : y;
    }

    public static void SumEqualProduct(int i,int j){
        for(i=1;i<=10;i++){         //相加=相乘
            for(j=1;j<=10;j++){
                if(i+j==i*j){
                    System.out.println(i+", "+j);
                }
            }
        }
        for(i=1;i<=100;i++){    //取1~100除了被10整除的數字
            if(i%10==0)
                continue;
            System.out.println(i);  //else
        }
        for(i=1;i<=100;i++){
            if(i%10==0)     //等於0,跳脫迴圈
                break;
            System.out.println(i);  //else
        }
    }

}
