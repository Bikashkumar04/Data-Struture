package stack;

public class arrayImplementation {
     public  static class stack{
        static final int capacity =1000;
        int[] arr =new int[capacity];
        int top;

         stack(){
             top =-1;
         }
        boolean isEmpty(){
            return (top <0);
        }
        boolean isFull(){
             if(top ==capacity-1){
                 System.out.println("stack is full");
                 return true;

             }
             return false;

        }
        void push(int x){
             if(top >=capacity-1){
                 System.out.println("stack overflow");
             }else{
                 top++;
                 arr[top] =x;
             }
        }
        int pop(){
             if(top <0){
                 System.out.println("stack underflow");
             }
             int x =arr[top];
             top--;
             return x;
        }
        int peek(){
            if(top <0){
                System.out.println("stack underflow");
            }
            int x =arr[top];
            return x;

        }
        int size(){
             return top+1;
        }
        void disply(){
             for(int i =0; i<=top;i++){
                 System.out.print(arr[i] + " ");
             }
        }



    }
    public static void main(String[] args) {
        stack st =new stack();
        st.push(5);
        st.push(5);
        st.push(5);
        st.push(5);
        System.out.println(st.pop());
        st.disply();

    }
}
