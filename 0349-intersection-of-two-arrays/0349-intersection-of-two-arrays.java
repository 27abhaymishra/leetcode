class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         // Step 1: Sort both arrays  
        Arrays.sort(nums1);  
        Arrays.sort(nums2);  
        
        // Step 2: Use two pointers to find the intersection  
        int pointer1 = 0;  
        int pointer2 = 0;  
        int[] temp = new int[Math.min(nums1.length, nums2.length)]; // Temporary array for storing intersection  
        int index = 0;  
        
        while (pointer1 < nums1.length && pointer2 < nums2.length) {  
            if (nums1[pointer1] < nums2[pointer2]) {  
                pointer1++;  
            } else if (nums1[pointer1] > nums2[pointer2]) {  
                pointer2++;  
            } else {  
                // If we have a common element, add it to the result if it's not already added  
                if (index == 0 || temp[index - 1] != nums1[pointer1]) {  
                    temp[index++] = nums1[pointer1];  
                }  
                pointer1++;  
                pointer2++;  
            }  
        }  
        
        // Step 3: Copy the results from temp to a new array with the exact size  
        return Arrays.copyOf(temp, index); // Create a new array containing only the intersection elements  
        
    }
}