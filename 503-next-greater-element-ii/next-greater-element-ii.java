class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        java.util.Arrays.fill(result, -1);
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && num > nums[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return result;
    }
}