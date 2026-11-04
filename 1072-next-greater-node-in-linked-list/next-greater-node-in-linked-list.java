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
    public int[] nextLargerNodes(ListNode head) {
      List<Integer> values = new ArrayList<>();
      int n=0;
      while(head!=null){
        values.add(head.val);
        head=head.next;
        n++;
      }  
      int[] ans = new int[n];
      Stack<Integer> st= new Stack<>();
      for(int i=0;i<n;i++){
        while(!st.isEmpty() && values.get(i)>values.get(st.peek())){
            int j = st.pop();
            ans[j]=values.get(i);
            
        }
        st.push(i);
      }
      return ans;
    }
}