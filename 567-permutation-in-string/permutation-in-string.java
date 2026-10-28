class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> freqmap= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            freqmap.put(ch,freqmap.getOrDefault(ch,0)+1);
        }
        int start=0;
        int matched = 0;
        for(int end =0 ; end<s2.length();end++){
            char curr =s2.charAt(end);
            if(freqmap.containsKey(curr)){
                freqmap.put(curr,freqmap.get(curr)-1);
                if(freqmap.get(curr)==0){
                    matched+=1;
                }
                
            }
           if(freqmap.size()==matched){
                return true;
            }
            //shrinking
            if(end>=s1.length()-1){
                char left = s2.charAt(start);
                if(freqmap.containsKey(left)){
                    if(freqmap.get(left)==0){
                        matched-=1;
                    }
                    freqmap.put(left,freqmap.get(left)+1);
                }
                start+=1;
            }

        }
        return false;
        
    }
}