//public class SinglyLinkedLIst {
//    class Node
//    {
//        int data;
//        Node next;
//
//        Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//    Node head;
//
//    public void addFirst(int data){
//        Node newNode= new Node(data);
//        if(head== null){
//            head = newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//
//    }
//
//    public void addLast(int data){
//        Node newNode= new Node(data);
//        if(head== null){
//            head = newNode;
//            return;
//        }
//        Node currNode = head;
//        while (currNode.next!=null){
//            currNode=currNode.next;
//        }
//        currNode.next=newNode;
//    }
//
//    public void display(){
//
//        Node nn= head;
//        while (nn!=null){
//            System.out.print(nn.data+ " ->");
//            nn=nn.next;
//        }
//        System.out.println("Null");
//
//
//    }
//
//    public static void main(String[] args) {
//    SinglyLinkedLIst list = new SinglyLinkedLIst();
//    list.addFirst(29);
//        list.display();
//    list.addFirst(802);
//        list.display();
//    list.addLast(1);
//    list.display();
//
//
//    }
//
//}
