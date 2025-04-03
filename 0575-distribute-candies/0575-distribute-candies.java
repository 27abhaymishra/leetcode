class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int uniquesum = 0;
        for(int x : candyType){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int k : map.keySet()){
            if(n/2 > uniquesum){
                uniquesum++;
            }
        }
        return uniquesum;
    }
}