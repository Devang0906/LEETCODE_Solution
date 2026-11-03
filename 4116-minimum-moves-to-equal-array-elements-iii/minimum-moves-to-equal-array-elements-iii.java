class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int x : nums){
            count+=(max-x);
        }
        return count;
    }
}