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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        while( temp.next != null  && temp.next.val < x  ){
            temp = temp.next;
        }
        ListNode curr = temp;
        while(curr.next != null){
            if(curr.next.val<x){
                ListNode n = curr.next;
                curr.next = n.next;
                n.next = temp.next;
                temp.next = n;
                temp = temp.next;
            }
            else{
                curr = curr.next;
            }
        }
    return dummy.next;
    }
}
