class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;

        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            mx = Math.max(mx , arr[i]);
        }

        int lo = 1; int hi = mx; int sd = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            int sum = 0;
             for(int i=0; i<n; i++){
                if(arr[i] % mid ==0)  sum+=arr[i]/mid;
                else sum +=arr[i]/mid + 1; 
            }
            if(sum <= t){
               sd = mid;
               hi = mid -1;
            }else{
                lo = mid + 1;
            } 
        }

        return sd;
    }
}