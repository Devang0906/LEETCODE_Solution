class Solution {
    public int minPairSum(int[] nums) {
        // Arrays.sort(nums);
        // int n= nums.length;
        // int max=Integer.MIN_VALUE;
        // for(int i=0; i<nums.length;i++){
        //    max=Math.max(max,nums[n-1-i]+nums[i]);


        // }
        // return max;
        
        int max = 0;
        for (int num : nums) {
        if (num > max) {
            max = num;
        }
    }
        int[] frq=new int[max+1];
        for(int num : nums){
            frq[num]++;
        }
        int sum=0;
        int i =0;
        int j =frq.length-1;
        while(i<=j){
            if(frq[i]==0){
                i++;
                continue;
            }
            if(frq[j]==0){
                j--;
                continue;
            }
           sum=Math.max(sum,i+j);
           frq[i]--;
           frq[j]--;
        }

        return sum;
    }
}