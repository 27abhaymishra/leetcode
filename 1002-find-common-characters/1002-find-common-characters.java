class Solution {
    public List<String> commonChars(String[] words) {
          int[] charCount = new int[26]; // To store the minimum counts of each character  
        // Initialize the charCount with the frequency of the first word  
        for (char c : words[0].toCharArray()) {  
            charCount[c - 'a']++;  
        }  

        // Update charCount for each word  
        for (int i = 1; i < words.length; i++) {  
            int[] currentCount = new int[26]; // Count for the current word  
            for (char c : words[i].toCharArray()) {  
                currentCount[c - 'a']++;  
            }  
            // Update the charCount to keep the minimum counts  
            for (int j = 0; j < 26; j++) {  
                charCount[j] = Math.min(charCount[j], currentCount[j]);  
            }  
        }  

        // Collect characters in the result list  
        List<String> result = new ArrayList<>();  
        for (int i = 0; i < 26; i++) {  
            while (charCount[i] > 0) {  
                result.add(String.valueOf((char) (i + 'a')));  
                charCount[i]--;  
            }  
        }  

        return result;  
    }
}