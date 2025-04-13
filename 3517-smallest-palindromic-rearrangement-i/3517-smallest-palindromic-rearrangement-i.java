import java.util.*;
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        String mid = "";

        // Build the first half of the palindrome
        for (int i = 0; i < 26; i++) {
            char currentChar = (char) ('a' + i);

            // If the character has odd frequency, one copy goes in the middle
            if (freq[i] % 2 == 1) {
                mid = String.valueOf(currentChar);
            }

            // Append half the characters to the first half
            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append(currentChar);
            }
        }

        // Build the full palindrome
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();
        return firstHalf.toString() + mid + secondHalf;
        
            }
        }
    
