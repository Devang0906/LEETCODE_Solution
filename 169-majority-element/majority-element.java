class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        // }
    HashMap<Integer,Integer> map = new HashMap <>();
    for(int i=0;i<nums.length;i++){
        int c=nums[i];
        if(!map.containsKey(c)){
            map.put(c,1);
        }
        else{
            map.put(c,map.get(c)+1);
        }
    }
    int a=0;
    for(int k : map.keySet()){
        int v=map.get(k);
        if(v>(nums.length/2)){
             a =k;
            break;
        }
    }
    return a;
    }   
}