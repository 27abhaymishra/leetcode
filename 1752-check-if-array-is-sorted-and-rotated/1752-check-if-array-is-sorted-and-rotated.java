class Solution {
    public boolean check(int[] nums) {
          int n = nums.length;  
        int dropCount = 0;  

        for (int i = 0; i < n; i++) {  
            // Check if the current element is greater than the next element (circularly)  
            if (nums[i] > nums[(i + 1) % n]) {  
                dropCount++;  
            }  
        }  

        // An array is sorted and rotated if there's at most one drop  
        return dropCount <= 1;
    }
}