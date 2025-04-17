class Solution {
    public int countCharacters(String[] words, String chars) {
        // Create a frequency map for the characters in 'chars'  
        HashMap<Character, Integer> charMap = new HashMap<>();  
        for (char c : chars.toCharArray()) {  
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);  
        }  
        
        int sum = 0;  
        
        // Iterate over each word  
        for (String word : words) {  
            // Create a frequency map for the characters in the word  
            HashMap<Character, Integer> wordMap = new HashMap<>();  
            for (char c : word.toCharArray()) {  
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);  
            }  
            
            // Check if the word can be formed using 'chars'  
            boolean canForm = true;  
            for (char c : wordMap.keySet()) {  
                if (wordMap.get(c) > charMap.getOrDefault(c, 0)) {  
                    canForm = false; // If a character exceeds available characters, we cannot form the word  
                    break;  
                }  
            }  
            
            // If the word can be formed, add its length to the sum  
            if (canForm) {  
                sum += word.length();  
            }  
        }  
        
        return sum;   
    }
}