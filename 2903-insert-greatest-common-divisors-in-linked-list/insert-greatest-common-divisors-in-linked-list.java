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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            int num=GCD(curr.val,curr.next.val);
            ListNode gcd=new ListNode(num,curr.next);
            curr.next=gcd;
            curr=gcd.next;
        }
        return head;
    }
    public int GCD(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return GCD(b,a%b);
        }
    }
}
