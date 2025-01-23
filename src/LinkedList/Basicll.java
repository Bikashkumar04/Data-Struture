package LinkedList;

public class Basicll {
    public static void display(Node head){
        Node temp =head;
        while(temp !=null){
            System.out.print(temp.data +" ");
            temp =temp.next;
        }
    }

    public static  int length(Node head){
        Node temp =head;
        int count =0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data =data;
        }

    }
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        Node e =new Node(5);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;

//        Node temp =a;
//        for(int i =0;i<6;i++){
//            System.out.print(temp.data +" ");
//            temp =temp.next;
//        }

//        while(temp !=null){
//            System.out.println(temp.data);
//            temp =temp.next;
//        }
        display(a);
        System.out.println();
        System.out.println(length(a));

    }
}