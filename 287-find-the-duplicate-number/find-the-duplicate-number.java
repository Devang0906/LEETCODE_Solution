class Solution {
    public int findDuplicate(int[] nums) {
        // TLE
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;

        // RUN BUT - Not metting the statement
        // Set<Integer> set =new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     if(!set.add(nums[i])){
        //         return nums[i];
        //     }
        // }
        // return n;

        //Binary search

        // int low=0;
        // int high=nums.length-1;

        // while(low<high){
        //     int mid=(low+high)/2;
        //     int count =0;
        //     for(int num : nums){
        //         if(num<=mid){
        //             count+=1;
        //         }
        //     }
        //     if (count>mid){
        //         high=mid;
        //     }
        //     else{
        //         low=mid+1;
        //     }
        // }
        // return low;
        int slow =nums[0];
        int fast = nums[nums[0]];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return slow;
    }
}