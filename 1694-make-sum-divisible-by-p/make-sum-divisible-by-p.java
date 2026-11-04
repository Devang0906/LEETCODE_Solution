class Solution {
    public int minSubarray(int[] nums, int p) {
        //TLE


        // long tsum=0;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     tsum+=nums[i];
        // }
        // if(tsum%p==0){
        //     return 0;
        // }
        // long target = tsum%p;
        // for(int i=0;i<nums.length;i++){
        //    int sum=0;
        //    for(int j=i;j<nums.length;j++){
        //     sum+=nums[j];
        //     long rem_sum=tsum-sum;
        //     if(rem_sum %p ==0){
        //         min=Math.min(min,j-i+1);
        //     }
        //    }

        // }
        // return min;

        //prefix sum

        long[] pre = new long[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        long sum=pre[pre.length -1];
        long target = sum%p;
        if(target == 0){
            return 0;
        }
        HashMap<Integer,Integer> map =new  HashMap<>();
        map.put(0,-1);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            long curr=pre[i]%p;

            long rem =(curr - target+p)%p;

            if(map.containsKey((int)rem)){
                min=Math.min(min,i-map.get((int)rem));
            }
            map.put((int) curr ,i);

        }

        if(min!=Integer.MAX_VALUE && min < nums.length){
            return min;
        }
        return -1;
    }
}