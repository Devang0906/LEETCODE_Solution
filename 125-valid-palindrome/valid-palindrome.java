class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left = 0;
        int right=s.length()-1;
        while(left<=right){
            char curr_left=s.charAt(left);
            char curr_right=s.charAt(right);
            if(!Character.isLetterOrDigit(curr_left)){
                left++;
            }
            else if(!Character.isLetterOrDigit(curr_right)){
                right--;
            }
            else if(Character.toLowerCase(curr_left)!= Character.toLowerCase(curr_right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}