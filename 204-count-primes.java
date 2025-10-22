/**
 * LeetCode Problem: 204. Count Primes
 * URL: https://leetcode.com/problems/count-primes/
 * Time: 7 ms (99.49%) | Memory: 49.10 MB (70.53%) - LeetSync
 * Difficulty: Medium
 * Date: 22-Oct-2025
 *
 * Time Complexity: O(n log log n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // no primes below 2

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }

        return count;
    }
}
