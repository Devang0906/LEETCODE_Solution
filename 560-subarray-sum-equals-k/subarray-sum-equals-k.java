class Solution {
    public int subarraySum(int[] nums, int k) {
       int[] pre = new int[nums.length +1];
       int count = 0;
       for(int i=0;i<nums.length;i++){
            pre[i+1]=pre[i]+nums[i];
       }
       for(int start = 0 ; start<pre.length;start++){
        for(int end = start+1;end<pre.length;end++){
            if(pre[end]-pre[start]==k){
                count++;
            }
        }
       }
       return count;
    }
}