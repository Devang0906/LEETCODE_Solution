class Solution {
    public List<String> commonChars(String[] words) {
      int[] freq=new int[26];
      for(int i=0;i<26;i++){
        freq[i]=Integer.MAX_VALUE;
      }

      for(String s : words){
        int[] charcount=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            charcount[c-'a']++;
        }
        for(int i=0;i<26;i++){
            freq[i]=Math.min(freq[i],charcount[i]);
        }
      }
      List<String> ans=new ArrayList<>();
      for(int i=0;i<26;i++){
        while(freq[i]>0){
        ans.add(String.valueOf((char)(i+'a')));
        freq[i]--;
      }
      }
    return ans;
    }
}