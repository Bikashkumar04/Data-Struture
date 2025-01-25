package stack;

import java.util.Stack;

public class displyStack {
    public static void displayRev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x =st.pop();
        System.out.print(x +" ");
        displayRev(st);
        st.push(x);

    }

    public static void display(Stack<Integer> st){
        if(st.size() ==0) return;
        int x =st.pop();
        display(st);

        System.out.print(x +" ");

        st.push(x);

    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(4);
        st.push(8);
        st.push(34);
        st.push(43);
        st.push(44);
        System.out.println(st);

//        Stack<Integer> rt =new Stack<>();
////        while (!st.isEmpty()){
////            rt.push(st.pop());
////        }
////
////        while (!rt.isEmpty()){
////            int x =rt.pop();
////            System.out.print(x +" ");
////            st.push(x);
////        }

//        int n =st.size();
//        int[] arr =new int[n];
//        for(int i =n-1;i>=0;i--){
//            arr[i] =st.pop();
//
//        }
//        for(int i =0; i<n;i++){
//            System.out.print(arr[i] +" ");
//            st.push(arr[i]);
//        }

//        displayRev(st);
        display(st);
    }
}
