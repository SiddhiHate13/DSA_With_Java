import java.util.*;
public class linkedlist {
    class Node {
        int value;
        Node next;

        Node(int val, Node next){
            value = val;
            this.next = next;
        }
    }
    Node head = null;
    Node tail = null;

    public void add(int val){
        Node newNode = new Node(val, null);
        if(head == null){
            head = new Node(val, null);
            tail = new Node(val, null);
            tail = head;
        }
        else{
            tail.next = new Node(val, null);
            tail = tail.next;
        }
    }

    public void remove(int index){
        Node temp = head;
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;    
    }

    public void printLL(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public class Main{
        public static void main(String[] args){
            linkedlist ll = new linkedlist();
            ll.printLL();
            ll.add(108);
            ll.add(3246);
            ll.add(634);
            ll.add(45632);
            ll.printLL();
            ll.remove(1);
            ll.printLL();
           

        }
    }
}