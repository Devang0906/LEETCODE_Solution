class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<p.length();i++){
            char ch = p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int start =0;
        int matched=0;
        for(int end =0 ; end<s.length();end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    matched+=1;
                }
            }
            if(map.size()==matched){
                result.add(start);
            }
            if(end>=p.length()-1){
                char left = s.charAt(start);
                if(map.containsKey(left)){
                    if(map.get(left)==0){
                        matched-=1;
                    }
                    map.put(left,map.get(left)+1);
                }
                start+=1;
            }
        }
        return result;
    }
}