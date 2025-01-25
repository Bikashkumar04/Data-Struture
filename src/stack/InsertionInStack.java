package stack;

import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(4);
        st.push(8);
        st.push(34);
        st.push(43);
        st.push(44);
        System.out.println(st);

        int idx =3;
        int x =32;
        Stack<Integer> temp =new Stack<>();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
