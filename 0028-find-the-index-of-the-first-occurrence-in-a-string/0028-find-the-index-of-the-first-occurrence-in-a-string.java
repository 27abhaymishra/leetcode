class Solution {
    public int strStr(String haystack, String needle) {
         // If needle is an empty string, return 0  
        if (needle.length() == 0) {  
            return 0;  
        }  
        
        // Get lengths of haystack and needle  
        int haystackLength = haystack.length();  
        int needleLength = needle.length();  
        
        // If haystack is smaller than needle, needle cannot be in haystack  
        if (haystackLength < needleLength) {  
            return -1;  
        }  
        
        // Loop through haystack  
        for (int i = 0; i <= haystackLength - needleLength; i++) {  
            // Check if the substring matches the needle  
            if (haystack.substring(i, i + needleLength).equals(needle)) {  
                return i; // Return the starting index  
            }  
        }  
        
        return -1; // If no match was found 
    }
}