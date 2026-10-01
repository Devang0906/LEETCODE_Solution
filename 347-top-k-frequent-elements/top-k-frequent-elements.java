class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1){
            return nums;
        }
        HashMap<Integer , Integer> hs=new HashMap<>();
        for(int x : nums){
            if(!hs.containsKey(x)){
                hs.put(x,1);
            }
            else if(hs.containsKey(x)){
                hs.put(x,hs.get(x)+1);
            }
        }
        int maxfreq=Collections.max(hs.values());

        List<Map.Entry <Integer,Integer>> list=new ArrayList<>(hs.entrySet());

        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
       
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }
        return result;

    }
}
