class Solution {
    public boolean isValid(String s) {
        Stack <Character> sa= new Stack<>();
        if(s.length()== 1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['|| ch=='('|| ch=='{')
            sa.push(ch);
            else{
                if(sa.isEmpty()){
                    return false;
                }
                if(ch==']' && sa.peek()=='['||
                ch =='}'&& sa.peek()=='{'||
                ch ==')'&& sa.peek()=='('){
                    sa.pop();
                }
                else{
                    return false;
                }
            }
        }
    return sa.isEmpty(); 
    }
}