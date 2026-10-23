class Solution {
    public int lengthOfLongestSubstring(String s) {
    int length = Integer.MIN_VALUE;
    int start=0;
    Map<Character , Integer> map = new HashMap<>();
    for(int end=0 ;end<s.length();end++){
        char c = s.charAt(end);
        map.put(c,map.getOrDefault(c,0)+1);
        if(map.size()!=end-start+1){     // we can use while() in place of if
           char left= s.charAt(start);
           map.put(left,map.get(left)-1);
           if(map.get(left)==0){
            map.remove(left);
           }
           start+=1;
        }
        length=Math.max(length , end-start+1);

    }
    return length == Integer.MIN_VALUE ? 0 : length;
    }
}