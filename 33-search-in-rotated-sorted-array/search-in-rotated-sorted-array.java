class Solution {
    public int search(int[] nums, int target) {
        // int index = Arrays.binarySearch(nums,target);
        // return index;
        int low=0;
        int high=nums.length-1;
        return Binarysearch(nums,target,low,high);
    }
    public int Binarysearch(int[] nums,int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[low]<=nums[mid]){
            if(target>=nums[low]&& target<nums[mid]){
             return Binarysearch(nums,target,low,mid-1);}
            else{
                return Binarysearch(nums,target,mid+1,high);
            }
        }
        else {
           if(target<=nums[high]&& target>nums[mid]){
            return Binarysearch(nums,target,mid+1,high);
           }
           else{
            return Binarysearch(nums,target,low,mid-1);
           }
        }
       
    }
}