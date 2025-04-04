class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        String ans = "";

        for(int i = 0; i<n && i<m; i++){
            ans += word1.charAt(i);
            ans +=word2.charAt(i);
        }

        if(n > m){
            for(int i = m ; i<n; i++){
                 ans += word1.charAt(i);
            }
        }else if(m > n){
             for(int i = n ; i<m; i++){
                 ans += word2.charAt(i);
            }
        }
        return ans;
    }
}