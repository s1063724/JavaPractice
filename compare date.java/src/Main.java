import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=s.replace("/"," ");//將字串s裡的"/"替換成" "
        String x[]=a.split(" ");//消除空格
        int c[]=new int[6];
        for(int i=0;i<c.length;i++){
            c[i]=Integer.parseInt(x[i]);//字串轉整數
        }
        if(c[2]>c[5]){
            System.out.println("After");
        }else if(c[2]<c[5]){
            System.out.println("Before");
        }else{
            if(c[1]>c[4]){
                System.out.println("After");
            }else if(c[1]<c[4]){
                System.out.println("Before");
            }else{

                if(c[0]>c[3]){
                    System.out.println("After");
                }else if(c[0]<c[3]){
                    System.out.println("Before");
                }else{
                    System.out.println("Same");
                }
            }
        }

    }
};