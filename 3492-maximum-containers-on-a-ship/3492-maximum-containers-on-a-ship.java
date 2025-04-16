class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        // total cell
        int tc = n * n; 
        //total weight can be load
        int max = tc * w;
        if(max < maxWeight){
            return tc;
        }else{
            return maxWeight / w;
        }
    }
}