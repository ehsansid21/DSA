class Solution {

    // Function to check if the ith bit is set
    public boolean checkIthBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // Main function to test the method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 13; // Binary: 1101
        int i = 2;

        // Call the method and print result
        boolean result = sol.checkIthBit(n, i);
        System.out.println("Is the " + i + "th bit set in " + n + "? " + result);
    }
}
