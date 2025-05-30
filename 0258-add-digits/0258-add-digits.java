class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0; // If the number is 0, return 0.  
        return 1 + (num - 1) % 9; // Use the digital root formula. 
    }
}