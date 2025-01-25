package stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st =new Stack<>();
        System.out.println("Enter the number of element");
        int n =sc.nextInt();
        System.out.println("enter the element");

        for(int i=0; i<n;i++){
            int x =sc.nextInt();
            st.push(x);
        }

        System.out.println(st);

        //reverse order
        Stack<Integer> gt =new Stack<>();

        while (!st.isEmpty()){
            gt.push(st.pop());

        }
        System.out.println(gt);

        Stack<Integer> rt =new Stack<>();

        while (!gt.isEmpty()){
            rt.push(gt.pop());

        }
        System.out.println(rt);

}
}

