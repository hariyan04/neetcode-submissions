class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length,big=arr[n-1];
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int temp=arr[i];
            arr[i]=big;
            if(big<temp){
                
                big=temp;
            }
            
            
            
        }

        return arr;
    }
}