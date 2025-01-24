package stack;

import java.util.Stack;

public class stackBasic {

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(44);
        st.push(54);
        st.push(55);
        st.push(65);
        st.push(64);

        System.out.println(st);

        System.out.println(st.peek());



    }
}
