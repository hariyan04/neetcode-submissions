class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(!map.containsKey(rem)){
                map.put(nums[i],i);
            }
            else{
                int a=Math.min(i,map.get(rem)),b=Math.max(i,map.get(rem));

                ans[0]=a;
                ans[1]=b;
                return ans;
            }
        }
        return ans;
    }
}
