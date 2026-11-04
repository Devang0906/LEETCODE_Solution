class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        // int z=0;
        // int o=0;
        // int t=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){z++;}
        //     if(nums[i]==1){o++;}
        //     if(nums[i]==2){t++;}
        // }
        // int i=0;
        // while(z!=0){
        //     nums[i]=0;
        //     i++;
        //     z--;
        // }
        //  while(o!=0){
        //     nums[i]=1;
        //     i++;
        //     o--;
        // }
        //  while(t!=0){
        //     nums[i]=2;
        //     i++;
        //     t--;
        // }
      
        //DUCTH NATIONAL FLAG algo
        int low =0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
                if(nums[mid]==0){
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                }
                else if(nums[mid]==2){
                    int temp=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp;
                    high--;
                }
                else if(nums[mid]==1){
                    mid++;
                }
        }

        
    }
}