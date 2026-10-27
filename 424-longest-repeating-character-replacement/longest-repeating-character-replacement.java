class Solution {
    public int characterReplacement(String s, int k) {
        Map < Character, Integer> frequencymap = new HashMap<>();
        int maxfreq=0;
        int start=0;
        int length =Integer.MIN_VALUE;
        for(int end =0 ; end<s.length();end++){
            char curr =s.charAt(end);
            frequencymap.put(curr,frequencymap.getOrDefault(curr,0)+1);
            maxfreq = Math.max(maxfreq , frequencymap.get(curr));
            if(end-start+1 - maxfreq > k){   // we can also use while()
                char left=s.charAt(start);
                frequencymap.put(left,frequencymap.get(left)-1);
                start+=1;
            }
            length=Math.max(length,end-start+1);
        }
        return length == Integer.MIN_VALUE ? 0 : length;

    }
}