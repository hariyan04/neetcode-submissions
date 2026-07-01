class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a1=new char[s.length()];
        char[] a2=new char[t.length()];
        a1=s.toCharArray();
        a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        String s1=Arrays.toString(a1);
        String s2=Arrays.toString(a2);
        if(s1.equals(s2)) return true;
        return false;

    }
}
