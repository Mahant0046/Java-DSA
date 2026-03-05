package StriverDSA.src.Practice;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

    public  static Node head;
    public static int size=0;


    static class Node{
        public static Node head=null;
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next=null;
        }
    }


    // Insert operation at the begining
    public static void addFirst(String data){
        Node node=new Node(data);
        if (head==null) {
            head = node;
            size++;
            return;
        }
        node.next=head;
        Node.head=node;
        size++;
    }

    // Insert at the end
    public static void addLast(String data){
        Node node=new Node(data);
        if (head==null) {
            head = node;
            size++;
            return;
        }
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=node;
        size++;

    }

    public static void addAtIndex(String data,int index){


    }

    // Remove the first node of the list
    public static void removeFirst(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    // Remove the last element of the list
    public static void removeLast(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node curr=head;
        Node prev=null;
        while(curr.next!=null){
                prev=curr;
                curr=curr.next;
        }
        prev.next=null;

    }

    // Traverse and print the list
    public static void traverse(){
        Node ptr=head;
        while(ptr!=null){
            if (ptr.next==null)
                System.out.print(ptr.data+" ");
            else
                System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }

    }

    public static int getIndex(String data){
        int index=0;
        Node ptr=head;
        while(ptr!=null){
            if (ptr.data.equals(data))
                return index;
            ptr=ptr.next;
            index++;
        }
        return -1;

    }

    // Reverse The linked list
    public static void reverseIterative(){

        if (head==null || head.next==null)
            return;
        Node currNode,prevNode,nextNode;
        prevNode=head;
        currNode=head.next;
        while (currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;

            // Update the nodes
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static Node reverseReccursion(Node ptr){
        if (ptr==null || ptr.next==null)
            return ptr;
        Node newHead=reverseReccursion(ptr.next);
        ptr.next.next=ptr;
        ptr.next=null;
        return newHead;
    }


    public static void main(String[] args) {

        List<String> ll=new LinkedList<>();
        addFirst("Welcome");
        addLast("Hello");
        addLast("World");
        addLast("java");
//        removeFirst();
//        removeLast();
        traverse();
        System.out.println();
        reverseReccursion(head);
//        System.out.println(size);
//        System.out.println(getIndex("Welcome"));
//        reverseIterative();
        System.out.println();
        traverse();

    }
}
