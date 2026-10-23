class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start =0 ;
        int wsum=0;
        int length = Integer.MAX_VALUE;
        for(int end = 0 ; end <nums.length;end++){
            wsum+=nums[end];
            while(wsum>=target){
                length= Math.min(length,end-start +1);
                wsum-=nums[start];
                start+=1;
            }

        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}