class Solution {
    public int totalFruit(int[] fruits) {
        //find the longest subarray atmost 2 unquie element
        Map<Integer,Integer> map = new HashMap<>();
        int start =0;
        int length=0;
        for(int end =0 ; end< fruits.length;end++){
            int curr = fruits[end];
            map.put(curr,map.getOrDefault(curr,0)+1);

            if(map.size()>2){
                int left = fruits[start];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                start+=1;

            }
            length=Math.max(length,end-start+1);
        }
        return length;

    }
}