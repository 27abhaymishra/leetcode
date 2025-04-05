class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      
        int count = 0; 
        for(int j = 0; j<jewels.length(); j++){
            for(int i = 0; i<stones.length(); i++ ){
                if(jewels.charAt(j) == stones.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
}