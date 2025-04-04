class Solution {
    public int lengthOfLastWord(String s) {
        String t[] = s.split(" ");
        String str =t[t.length-1];
        return str.length();
    }
}