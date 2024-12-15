package LLQues;

public class LoopinLL {
    Node slow=head;
    NOde fast = head;
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;

        if (fast == slow) {
            System.out.println("Loop present");
        }

    }
    System.out.println("Loop not present");

}
