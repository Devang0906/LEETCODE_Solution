class Solution {
    public int search(int[] nums, int target) {
        int indx=Arrays.binarySearch(nums,target);
        if(indx<0){
            return -1;
        }
        else{
            return indx;
        }
    }
}