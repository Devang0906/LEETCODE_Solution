class Solution {
    public int reverseDegree(String s) {
        int rev;
        int d=0;
        char chr;
        for(int i=0;i<s.length();i++)
        {
            chr= s.charAt(i);
            rev= 26-(chr-'a'); 
            d=d+(i + 1)*rev;
        }
        return d;

    }
}