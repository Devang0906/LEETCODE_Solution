class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            max=Math.max(max,nums[n-1-i]+nums[i]);

        }
        return max;
    }
}