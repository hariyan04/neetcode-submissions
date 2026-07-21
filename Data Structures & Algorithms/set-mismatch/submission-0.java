class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[2];
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(mp.getOrDefault(i,0)==2) ans[0]=i;
            if(!mp.containsKey(i)) ans[1]=i;
        }
        return ans;
    }
}