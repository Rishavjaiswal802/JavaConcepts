package DoublyLL;

public class DoublyLinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    public void insertAtBeg(int data){
        Node newNode = new Node(data);

        newNode.next=head;
        newNode.data=data;
        newNode.prev=null;
        if(head!=null){
        head.prev=newNode;
        }
        head=newNode;
    }

    public void display(){
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    public void reverseDisplay(){
        Node curNode =head ;
        Node last=null;
        while (curNode!=null){
            last=curNode;
            curNode=curNode.next;

        }
        while (last!=null){
            System.out.print(last.data+" ->");
            last=last.prev;
        }
        System.out.println("Null");

    }




    public static void main(String[] args)
    {
        DoublyLinkedList list= new DoublyLinkedList();
        list.insertAtBeg(53);
        list.insertAtBeg(23);
        list.insertAtBeg(65);
        list.insertAtBeg(27);
        list.display();
        list.reverseDisplay();
    }

}
