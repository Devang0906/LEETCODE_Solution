class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix.length;
        int m= matrix[0].length;
        int low=0;
        int high=(m*n)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=matrix[mid/m][mid%m];

            if(target==val){
                return true;
            }
            else if(target<val){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}