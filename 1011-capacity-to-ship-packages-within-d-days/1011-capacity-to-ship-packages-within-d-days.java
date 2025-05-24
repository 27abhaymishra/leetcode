class Solution {
    public boolean isPossible(int arr[] , int c, int d){
        int days = 1; int load = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] + load <= c){
                load +=arr[i];
            }else{
                load = arr[i];
                days++;
            }
        }
        if(days <= d)  return true;
        return false;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0,mx = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            mx = Math.max(mx,arr[i]);
            sum +=arr[i];
        }
        int lo = mx , hi = sum; int minC = sum;

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(isPossible(arr,mid,d)){
                minC = mid;
                hi = mid -1;
            }else{
                lo = mid + 1;
            }
        }
        return minC;
    }
}