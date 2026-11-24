class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

            // TLE
            
    // int n= nums.length;
    // Set<List<Integer>> result=new HashSet<>();
    // for(int i=0;i<n;i++){
    //     for(int j = i+1;j<n;j++){
    //         for(int k=j+1;k<n;k++){
    //             if(nums[i]+nums[j]+nums[k]==0){
    //                 List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
    //                 Collections.sort(triplet);
    //                 result.add(triplet);

    //             }
    //         }
    //     }
    // }
    // return new ArrayList<>(result);


        //TLE        
    // int n = nums.length;
    // Set<List<Integer>> result = new HashSet<>();

    // for (int i = 0; i < n; i++) {
    //     Set<Integer> set = new HashSet<>();
    //     for (int j = i + 1; j < n; j++) {
    //         int target = -nums[i] - nums[j];
            
    //         if (set.contains(target)) {
    //             List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
    //             Collections.sort(triplet);
    //             result.add(triplet);
    //         }
            
    //         // Add the current element to the set, not the target
    //         set.add(nums[j]); 
    //     }
    // }
    
    // return new ArrayList<>(result);
Arrays.sort(nums);
Set<List<Integer>> set = new HashSet<>();

for (int i = 0; i < nums.length - 2; i++) {
    int low = i + 1;
    int high = nums.length - 1;
    
    while (low < high) {
        int sum = nums[i] + nums[low] + nums[high];
        
        if (sum == 0) {
            set.add(Arrays.asList(nums[i], nums[low], nums[high]));
            low++;
            high--;
        } else if (sum < 0) {
            low++;
        } else {
            high--;
        }
    }
}

return new ArrayList<>(set);

    }
}