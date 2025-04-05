class Solution {
    public int numJewelsInStones(String jewels, String stones) {
           HashMap<Character,Integer> m = new HashMap<>();
        int count =0;
        for(int i=0;i<jewels.length();i++) m.put(jewels.charAt(i),1);
        for(int i=0;i<stones.length();i++) if(m.containsKey(stones.charAt(i))) count++;
        return count;
    }
}