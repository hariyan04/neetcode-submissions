class Solution {
    public int removeElement(int[] nums, int val) {
        int first_val_index=-1;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) {
                first_val_index=i;
                n++;
                break;
            }
        }
        if(first_val_index==-1) return nums.length;
        
        for(int i=first_val_index+1;i<nums.length;i++){
            if(nums[i]!=val){
                nums[first_val_index]=nums[i];
                nums[i]=val;
                first_val_index++;
                
            }
            else n++;
        }
        return nums.length-n;

    }
}