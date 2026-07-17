class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        
        for(int i=1;i<strs.length;i++){
            int j=0;String s1=strs[i];
            while(j<s.length() && j<s1.length() && 
              s.charAt(j)==s1.charAt(j)) j++;
            s=s.substring(0,j);
        }
        return s;
        
    }
}