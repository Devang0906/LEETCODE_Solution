class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<numbers.length;i++){
        //     int diff=target-numbers[i];
        //     if(map.containsKey(diff)){
        //         return new int[] {map.get(diff)+1,i+1};
        //     }
        //     map.put(numbers[i],i);
        // }
        
        // return new int[] {};


        //TLE
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1,j+1}; 
        //         }
        //     }
        // }
        // return new int[]{};

        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[] {i+1,j+1};
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
}