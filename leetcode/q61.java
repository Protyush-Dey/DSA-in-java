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
    public int Length(ListNode head){
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
}
    public ListNode rotateRight(ListNode head, int k) {
        int n=Length(head);
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        k=k%n;
        if (k == 0) {
            return head;
        }
        ListNode temp = head;
        for(int i=0;i<n-k-1;i++){
            temp=temp.next;
        }
        ListNode nh =temp.next;
        temp.next=null;
        ListNode tail = nh;
         while(tail.next!=null){
            
            tail=tail.next;
        }
        
            tail.next=head;
        
        return nh;

    }
}
