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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        Stack<ListNode>st = new Stack<>();
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        ListNode newnode=null;
        while(!st.isEmpty()){
            ListNode node=st.pop();
            if(newnode==null||node.val>=newnode.val){
            node.next=newnode;
            newnode=node;
            }
        }
        return newnode;
    }
}