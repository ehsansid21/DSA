import java.util.*;

class Solution {
    // LeetCode method
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int multiple = k;
        while (!set.contains(multiple)) {
            if (!set.contains(multiple)) return multiple;
            multiple += k;
        }
        return multiple; // fallback
    }

    // Local testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {8, 2, 3, 4, 6};
        int k = 2;
        System.out.println(sol.missingMultiple(nums, k)); // Output: 10
    }
}
