class Solution {
    public int countGoodSubstrings(String s) {
        int start =0 ;
        int count=0;
        for(int end = 0 ;end<s.length();end++){
            if(end - start+1 == 3 ){
                char c1 = s.charAt(start);
                char c2 = s.charAt(start+1);
                char c3 = s.charAt(end); 
                if(c1 !=c2 && c1!=c3 &&  c2!=c3){
                count++;
            }
             start++;
            }
           
        }
        return count;
    }
}