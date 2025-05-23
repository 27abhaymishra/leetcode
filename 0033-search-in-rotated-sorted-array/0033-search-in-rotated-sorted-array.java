
class Solution {  
    public int search(int[] nums, int target) {  
        int lo = 0, hi = nums.length - 1;  

        while (lo <= hi) {  
            int mid = lo + (hi - lo) / 2; // Prevents overflow  

            if (nums[mid] == target) {  
                return mid;  
            }  

            // Check if the left side is sorted  
            if (nums[lo] <= nums[mid]) {  
                // Target is in the left sorted portion  
                if (nums[lo] <= target && target < nums[mid]) {  
                    hi = mid - 1;  
                } else {  
                    lo = mid + 1;  
                }  
            } else { // Right side must be sorted  
                // Check for target in the sorted right portion  
                if (mid + 1 <= hi && target >= nums[mid + 1] && target <= nums[hi]) {  
                    lo = mid + 1;  
                } else {  
                    hi = mid - 1;  
                }  
            }  
        }  
        return -1; // Target not found  
    }  
}  