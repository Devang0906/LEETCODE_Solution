class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<>();
        Map < String , List<String>> map = new HashMap<>();
        for(String s : strs){
             char[] c = s.toCharArray();
             Arrays.sort(c);
             String sort= new String(c);
            
            if(!map.containsKey(sort)){
                map.put(sort , new ArrayList<>());
            }
            map.get(sort).add(s);
        }
        return  new ArrayList<>(map.values());
    }
}