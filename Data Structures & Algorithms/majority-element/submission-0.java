class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int max=mp.get(nums[0]);
        int ele=nums[0];
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(max<e.getValue()){
                ele=e.getKey();
                max=e.getValue();
            }
        }
        return ele;
        
    }
}