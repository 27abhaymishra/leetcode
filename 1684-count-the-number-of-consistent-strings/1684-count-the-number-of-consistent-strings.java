class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         HashMap<Character, Integer> m = new HashMap<>();  
        int count = 0;  

        // Populate the hashmap with allowed characters  
        for (int i = 0; i < allowed.length(); i++) {  
            m.put(allowed.charAt(i), 1); // Using 1 as a dummy value  
        }  

        for (int i = 0; i < words.length; i++) {  
            String str = words[i];  
            boolean isConsistent = true; // Assume the word is consistent initially  

            // Check each character in the word  
            for (int j = 0; j < str.length(); j++) {  
                if (!m.containsKey(str.charAt(j))) {  
                    isConsistent = false; // Found a character not in allowed  
                    break; // No need to check further for this word  
                }  
            }  

            // If the word is consistent, increase the count  
            if (isConsistent) {  
                count++;  
            }  
        }  

        return count;  
    }
}