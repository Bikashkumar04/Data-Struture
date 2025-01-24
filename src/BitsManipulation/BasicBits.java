package BitsManipulation;

import java.util.Collections;

public class BasicBits {
    public  static  String binary(int x){
        StringBuilder res =new StringBuilder();
        while (x != 1){
            if(x %2 ==1){
                res.append("1");
            }else res.append("0");
            x/=2;
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        int num =13;
        System.out.println(binary(num));

    }
}
