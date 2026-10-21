class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length==0){ 
            return "";
        }
        Arrays.sort(strs);
        String i=strs[0];
        String j = strs[strs.length -1];
        int index =0; 
        while(index<i.length() && index<j.length()){
            if(i.charAt(index) == j.charAt(index)){
                index++;
            }
            else {
                break;
            }
        }
        return i.substring(0,index);
            
        }
    }