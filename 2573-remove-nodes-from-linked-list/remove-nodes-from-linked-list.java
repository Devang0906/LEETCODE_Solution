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
        // ListNode curr=head;
        // Stack<ListNode>st = new Stack<>();
        // while(curr!=null){
        //     st.push(curr);
        //     curr=curr.next;
        // }
        // ListNode newnode=null;
        // while(!st.isEmpty()){
        //     ListNode node=st.pop();
        //     if(newnode==null||node.val>=newnode.val){
        //     node.next=newnode;
        //     newnode=node;
        //     }
        // }
        // return newnode;

            //BY REVERSAL
        // ListNode prev = null, curr = head;
        // while (curr != null) {
        //     ListNode next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // ListNode dummyHead = new ListNode(-1);
        // ListNode tempPrev = dummyHead;
        // curr = prev;

        // while (curr != null) {
        //     if (curr.val >= tempPrev.val) {
        //         tempPrev.next = curr;
        //         tempPrev = curr;
        //         curr = curr.next;
        //     } else {
        //         curr = curr.next;
        //     }
        // }
        // tempPrev.next = null;

        // ListNode newPrev = null, newCurr = dummyHead.next;
        // while (newCurr != null) {
        //     ListNode next = newCurr.next;
        //     newCurr.next = newPrev;
        //     newPrev = newCurr;
        //     newCurr = next;
        // }

        // return newPrev;

        //BY TWO REVERSAL
        if (head == null || head.next == null) {
            return head;
        }

        head = reverse(head);


        ListNode curr = head;
        int maxVal = curr.val;

        while (curr != null && curr.next != null) {
            if (curr.next.val < maxVal) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                maxVal = curr.val;
            }
        }

        return reverse(head);
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}
