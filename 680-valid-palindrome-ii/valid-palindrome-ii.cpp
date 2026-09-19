class Solution {
public:
    bool ispal(string &s,int l,int r){
        while(l<r){
            if(s[l]!=s[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    bool validPalindrome(string s) {
        int l=0;
        int r=s.size()-1;
        while(l<r){
            if(s[l]!=s[r]){
                if(ispal(s,l+1,r)){
                    return true;
                }
                if(ispal(s,l,r-1)){
                    return true;
                }
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

};