class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(int i=0;i<details.length;i++){
            if(details[i].charAt(11)>='6' && details[i].charAt(12)>='1') ans++;
            else if(details[i].charAt(11)>='7' && details[i].charAt(12)>='0') ans++;
        }
        return ans;
    }
}