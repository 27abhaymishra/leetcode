class Solution {
    public boolean areOccurrencesEqual(String s) {
        int hash [] = new int [26];

        for(char c : s.toCharArray()){
            hash[c - 'a']++;
        }
        for(int x : hash){
            System.out.print(x + " ");
        }
        int count = 0;
       for(int x : hash){
            if(x > 0){
                count = x;
                break;
            }
       }
        for(int i = 0;  i<26;  i++){
            if(count != hash[i] && hash[i] != 0){
                return false;
            
            }
        }
        return true;
    }
}