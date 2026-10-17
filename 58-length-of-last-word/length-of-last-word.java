class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String S = str[str.length-1];
        return S.length();
    }
}