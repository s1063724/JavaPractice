import java.util.*;
public class Decode_text{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            int tmp =s.charAt(i) - 'A';
            tmp -= 3;
            // tmp %= 26;
            tmp = Math.floorMod(tmp, 26);
            tmp += 'A';
            System.out.print((char)tmp);
        }
        System.out.println();
    }
};