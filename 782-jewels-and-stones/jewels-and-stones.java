class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int count=0;

        // THis approach cheaks only A || a if there is B the this is not the approach

        // for(char c : stones.toCharArray()){
        //     if(c=='a'||c=='A'){
        //         count++;
        //     }
        // }
        // return count;

        Set<Character> jewelset= new HashSet<>();
        for(char j : jewels.toCharArray()){
            jewelset.add(j);
        }
        for(char s : stones.toCharArray()){
            if(jewelset.contains(s)){
                count++;
            }
        }
        return count;
    }
}