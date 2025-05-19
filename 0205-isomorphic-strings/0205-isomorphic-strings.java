class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char[] a = new char[128];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if(a[idx] == '\0')  a[idx] = dh;
            else{
                if(a[idx] != dh) return false;
            }
        }

        char[] b = new char[128];
        for(int i = 0; i<s.length(); i++){
            char dh = t.charAt(i);
            char ch = s.charAt(i);
            int idx = (int)dh;
            if(b[idx] == '\0') b[idx] = ch;
            else{
                if(b[idx] != ch) return false;
            }
        }
        return true;
    }
}