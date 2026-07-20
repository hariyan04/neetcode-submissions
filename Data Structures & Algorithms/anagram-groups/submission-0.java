class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
            //String s=str;
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(str);

        }
        return new ArrayList<>(mp.values());
    }
}