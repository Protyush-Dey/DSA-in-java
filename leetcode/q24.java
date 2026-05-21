/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode tmp = new ListNode(0);
       tmp.next = head;
       ListNode t = new ListNode();
       t = tmp;
       while(t.next != null && t.next.next != null){
        ListNode a = t.next;
        ListNode b = t.next.next;
        a.next = b.next;
        b.next = a;
        t.next = b;
        t = a;
       }
       return tmp.next; 
    }
}
