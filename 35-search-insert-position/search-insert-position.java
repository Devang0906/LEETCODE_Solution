class Solution {
    public int searchInsert(int[] nums, int target) {
        int indx=Arrays.binarySearch(nums,target);
        if(indx<0){
            return (indx*-1)-1;
        }
        else 
        return indx;
    }
}