class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int counter=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(!mp.containsKey(n-1)){
                
                int c=0;
                while(mp.containsKey(n++)){
                    c++;
                }
                counter=Math.max(counter,c);
            }
        }
        return counter;
    }
}
