package LLQues;
public class MiddleLL {
    Node head;
    private class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;

        }
    }

    private Node midElem(head){
        Node fast= head.next;
        Node slow = head;
        if(head==null)return head;
        while (fast!=null){
            fast=fast.next;
            if (fast!=null){
                fast=fast.next;

            }
                slow=slow.next;
        }
        return slow;
    }
}
