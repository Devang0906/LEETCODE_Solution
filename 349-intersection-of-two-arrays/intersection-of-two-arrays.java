class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs =new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int x : nums1){
            hs.add(x);
        }
        for(int x : nums2){
            if(hs.contains(x)){
                result.add(x);
            }
        }
        int[] ans= new int[result.size()];
        int i = 0;
        for (int val : result) {
            ans[i++] = val;
        }
        return ans;
    }
}