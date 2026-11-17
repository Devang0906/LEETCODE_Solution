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
        ListNode A=new ListNode(0);
        ListNode B=new ListNode(0);
        ListNode AH=A;
        ListNode BH=B;
        while(head!=null){
            if(head.val<x){
                BH.next=head;
                BH=BH.next;
            }
            else{
                AH.next=head;
                AH=AH.next;
            }
            head=head.next;
        }
        AH.next=null;
        BH.next=A.next;
        return B.next;
    }
}