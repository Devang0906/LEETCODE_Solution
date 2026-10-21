class Solution {
    public boolean isAnagram(String s, String t) {
        // char [] a = s.toCharArray();
        // char [] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);

        // return Arrays.equals(a,b);

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char str=t.charAt(i);
            if(hm.containsKey(str)){
                hm.put(str,hm.get(str)-1);
            }
            else{
                return false;
            }
        }
        for(char key:hm.keySet()){
            int val=hm.get(key);
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}