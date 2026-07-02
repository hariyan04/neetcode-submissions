class Solution {
    public int lengthOfLastWord(String s) {
        String str="";
        String temp="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') temp+=s.charAt(i);
            else{
                str=temp;
                temp="";
            }
            
        }
        return temp.length();
    }
}