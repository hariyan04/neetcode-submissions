class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> al =new ArrayList<>();
        int d=nums.length/3;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value>d) al.add(key);
        }
        return al;
    }
}