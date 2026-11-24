class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partition=new ArrayList<>();

        int start=0;
        int end=0;

        int[] lastocc=new int[26];
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            lastocc[curr-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            int lastIndex= lastocc[curr-'a'];
            end=Math.max(end,lastIndex);

            if(i==end){
                partition.add(end-start+1);
                start=i+1;
            }
        }
        return partition;
    }
}