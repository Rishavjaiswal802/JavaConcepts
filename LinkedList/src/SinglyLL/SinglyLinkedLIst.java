package SinglyLL;

import java.util.Scanner;

public class SinglyLinkedLIst {
    Scanner sc = new Scanner(System.in);
    private  Node head;
    private Node tail;
    private  int size;

    public SinglyLinkedLIst() {
        this.size = size=0;
    }

    private static class Node{
        private  int data;
        private Node next;

        public  Node(int data) {
            this.data = data;
        }
    }
    //Insert at the beg of the node
    public void insertAtBeg(int data){
        //System.out.println("Please Enter  the value to be inserted...");
        Node newNode = new Node(data);
        newNode.data= data;
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    //Insert at last node
    public void insertAtLast(int data){

        if (tail == null) {
            insertAtBeg(data);
        }
        Node node = new Node(data);
        tail.next=node;
        tail=node;
        size++;
    }

    //Inserting at a particular Index
    public void insertAtIndex(int data, int index){
        Node node = new Node(data);
        Node temp= head;
        for (int i = 0; i < size; i++) {
            if (i==index-1)
            {
               Node local=temp.next;
               temp.next=node;
               node.next=local;
               node.data=data;
            }
            temp=temp.next;
        }
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head=head.next;
        if (head == null) {
            tail=null;
        }
        size--;
        System.out.print("The deleted item is :");
        return val;
    }

    public  int deleteLast(){
        if (size<=1){
          return   deleteFirst();
        }
        Node SecLar= getIndex(size-2);
        int val=  tail.data;
        tail=SecLar;
        tail.next=null;
        size--;
        System.out.print("The deleted node had the value:");
        return val;
    }


    public Node getIndex(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
    }


    public  int deletefromIndex(int index){
        Node temp= head;
        for (int i = 0; i < index-1; i++) {
            temp= temp.next;

        }
        int val= (temp.next).data;
        temp.next=(temp.next).next;
        size--;
        System.out.print("The deleted item from the index "+index+" was:");
        return val;

    }
    public void printNode(){
        Node tempNode= head;
        while (tempNode!=null){
            System.out.print(tempNode.data+" ->");
            tempNode=tempNode.next;
        }
        System.out.println("NULL");
        System.out.println("The size of the SinglyLinkedLIst is : "+size);
    }













    public static void main(String[] args) {
        SinglyLinkedLIst list = new SinglyLinkedLIst();
        list.insertAtBeg(127);
        list.insertAtBeg(167);
        list.insertAtBeg(448);
        list.insertAtBeg(123);
        list.insertAtLast(802);
        list.printNode();
        list.insertAtIndex(29,3);
        list.printNode();
        System.out.println(list.deleteFirst());
        list.printNode();
        list.deleteLast();
        list.printNode();
        list.deletefromIndex(1);
        list.printNode();

    }



}