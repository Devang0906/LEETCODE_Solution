class Solution {
    public int minMoves2(int[] nums) {
        int mid=0;
        int count=0;
        Arrays.sort(nums);
        
            mid=nums[nums.length/2];

        for(int num : nums){
            count+=Math.abs(num-mid);
        }
        return count;
    }
}