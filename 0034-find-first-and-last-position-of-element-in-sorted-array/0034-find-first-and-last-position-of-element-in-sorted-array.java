class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int ans[] = new int[2];

        int lo = 0; int hi = n-1;
        int fp = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(arr[mid] == target){
                if( mid > 0  && arr[mid] == arr[mid - 1]){
                    hi = mid - 1;
                }else{
                    fp = mid;
                    break;
                }
            }else if(arr[mid] > target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        ans[0] = fp;

           lo = 0;  hi = n-1;
        int lp = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(arr[mid] == target){
                if(mid+1 < n  && arr[mid] == arr[mid + 1]){
                  lo = mid +1;
                }else{
                    lp = mid;
                    break;
                }
            }else if(arr[mid] > target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        ans[1] = lp;

        return ans;

    }
}