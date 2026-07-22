class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp1= new HashMap<>();
        HashMap<String,Character> mp2= new HashMap<>();
        String[] str=s.split(" ");
        if(pattern.length()!=str.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String t=str[i];
            //pattern--->s
            if(mp1.containsKey(ch)){
                if(!mp1.get(ch).equals(t)) return false;
            }
            else mp1.put(ch,t);
            //s-->pattern
            if(mp2.containsKey(t)){
                if(mp2.get(t)!=ch) return false;
            }
            else mp2.put(t,ch);


        }
        return true;
    }
}