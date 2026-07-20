class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=ele && max!=0){
                max--;
            }
            else if(nums[i]==ele){
                max++;
            }
            else if(max==0){
                ele=nums[i];
                max=1;
            }
        }
        return ele;
    }
}