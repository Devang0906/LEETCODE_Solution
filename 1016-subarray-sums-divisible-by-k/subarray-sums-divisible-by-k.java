class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map < Integer , Integer > map = new HashMap<>();
        int sum=0;
        int result =0 ;
        map.put(0,1);
        for(int num : nums){
            sum+=num;
            int rem = sum%k;
            if(rem < 0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                result+=map.get(rem);
            }
            map.put(rem ,map.getOrDefault(rem,0)+1);
        }
        return  result;
    }
}