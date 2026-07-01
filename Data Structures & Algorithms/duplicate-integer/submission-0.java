class Solution {
    public boolean hasDuplicate(int[] a) {
        int n=a.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.isEmpty()||!set.contains(a[i])) set.add(a[i]);
            else return true;
        }
        return false;
        

    }
}