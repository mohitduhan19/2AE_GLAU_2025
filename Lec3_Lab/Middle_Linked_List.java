package AE.Lec3_Lab;


public class Middle_Linked_List {
     class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode f = head.next , s = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        if(f != null )return s.next;
        return s;
    }
}
