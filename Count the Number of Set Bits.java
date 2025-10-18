 class Solution {

    public int countSetBits(int n) {
        int c = 0;
        while (n > 0) {
            n = n & (n - 1);
            c++;
        }
        return c;
    }
//hello new commit

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 29;
        int result = sol.countSetBits(n);

        System.out.println("Number of set bits in " + n + " is: " + result);
    }
}
