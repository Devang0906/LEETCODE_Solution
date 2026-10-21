class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start =0 ;
        int wsum = 0;
        int maxsum=Integer.MIN_VALUE;
        for(int end =0 ; end< nums.length;end++){
            wsum +=nums[end];
            if(end - start +1 == k){
                maxsum = Math.max(maxsum,wsum);
                wsum -=nums[start];
                start +=1;
            }
        }
        return (double) maxsum/k;
    }
}