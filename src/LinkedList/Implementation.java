package LinkedList;

public class Implementation {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    public static class linkedlist{
        Node head =null;
        Node tail =null;

        void insertAtEnd(int val){
            Node temp =new Node(val);
            if(head ==null){
                head =temp;
            }else{
                tail.next =temp;
            }
            tail =temp;
        }
        void insertAt(int idx,int val){
            Node t =new Node(val);
            Node temp =head;
            if(idx ==size()){
                insertAtEnd(val);
                return;
            }
            if(idx ==0){
                insertAtBeginning(val);
                return;
            }
            for(int i =0; i<idx-1;i++){
                temp =temp.next;
            }
            t.next =temp.next;
            temp.next =t;

        }

        int getAt(int idx){
            Node temp =head;
            for(int i =0; i<idx;i++){
                temp =temp.next;

            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx ==0){
                head =head.next;
                return;
            }
            Node temp =head;
            for(int i =0; i<idx-1;i++){
                temp =temp.next;
                tail =temp;
            }
            temp.next =temp.next.next;
        }
        void insertAtBeginning(int val){
            Node temp =new Node(val);
            if(head ==null){
                head =temp;
                tail =temp;
            }else {
                head.next = temp;
                head = temp;
            }
        }
        void display(){
            Node temp =head;
            while (temp!=null){
                System.out.print(temp.data +" ");
                temp =temp.next;
            }
        }
        int size(){
            Node temp =head;
            int count =0;
            while (temp !=null){
                count ++;
                temp =temp.next;

            }
            return count;
        }

    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtBeginning(89);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(45);
        ll.insertAtEnd(456);

        ll.display();
        System.out.println();
        System.out.println(ll.size());

    }
}
