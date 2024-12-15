package LLQues;

public class ReverseLL {
    private Node head;
    private class Node {
        private int data;
        private Node next;
        Node(int data){
            this.data=data;

        }
    }
    public void insertNode(int data){
        Node newNode= new Node(data);
        newNode.data=data;
        newNode.next=head;
        head=newNode;

    }

    public Node reverseLL(){
        Node prevNode= null;
        Node currNode= head;
        Node forward;

        while (currNode!=null){
            forward=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=forward;
        }
       return prevNode;

    }

    public void display(){
        Node currNode= head;
        while (currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NUll");
    }
    public static void main(String[] args) {
        ReverseLL list= new ReverseLL();
        list.insertNode(3);
        list.insertNode(5);
        list.insertNode(7);
        list.insertNode(9);
        list.insertNode(11);
        list.display();
        list.reverseLL();
        list.display();

    }
}
