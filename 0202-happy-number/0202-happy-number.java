class Solution {
    public boolean isHappy(int n) {
          HashSet<Integer> seen = new HashSet<>(); // HashSet to store seen numbers  
        
        while (n != 1 && !seen.contains(n)) {  
            seen.add(n); // Add the current number to the set  
            n = sumOfSquares(n); // Update n to the sum of squares of its digits  
        }  
        
        return n == 1; // If n reaches 1, it is a happy number  
    }  

    // Helper function to calculate the sum of squares of digits  
    private int sumOfSquares(int num) {  
        int sum = 0;  
        while (num > 0) {  
            int digit = num % 10; // Get last digit  
            sum += digit * digit; // Square it and add to sum  
            num /= 10; // Remove last digit  
        }  
        return sum; // Return the sum of squares  
    }
}