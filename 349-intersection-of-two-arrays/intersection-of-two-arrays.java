class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // HashSet<Integer> hs =new HashSet<>();
        // HashSet<Integer> result=new HashSet<>();
        // for(int x : nums1){
        //     hs.add(x);
        // }
        // for(int x : nums2){
        //     if(hs.contains(x)){
        //         result.add(x);
        //     }
        // }
        // int[] ans= new int[result.size()];
        // int i = 0;
        // for (int val : result) {
        //     ans[i++] = val;
        // }
        // return ans;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();

        for( int x : nums1){
            map.put(x,1);
        }
        for (int i : nums2){
            if(map.containsKey(i) && map.get(i)==1){
                result.add(i);
                map.put(i,0);
            }
        }
        int[] out=new int[result.size()];
        for(int i=0;i<result.size();i++){
            out[i]=result.get(i);
        }
        return out;

        
    }
}