class Solution {
    public int findGCD(int[] nums) {
        
    // Function to find GCD of smallest and largest numbers in the array
   
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max values in the array
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Return the gcd of min and max
        return gcd(min, max);
    }
     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    }
