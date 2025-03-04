package AE.Lec3_Lab;

public class Cycle_Detection {
    class listNode {
        int val;
        listNode next;
        listNode() {}
        listNode(int val) { this.val = val; }
        listNode(int val, listNode next) { this.val = val; this.next = next; }
    }
    public boolean hasCycle(listNode head) {
        if(head == null)return false;
        listNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)return true;
        }
        return false;
    }
}
