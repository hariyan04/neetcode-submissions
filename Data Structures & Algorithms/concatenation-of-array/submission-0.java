class Solution {
    public int[] getConcatenation(int[] a) {
        int[] ans=new int[2*a.length];
        for(int i=0;i<a.length;i++){
            ans[i]+=a[i];
            ans[i+a.length]=a[i];
        }
        return ans;

        
        
    }
}