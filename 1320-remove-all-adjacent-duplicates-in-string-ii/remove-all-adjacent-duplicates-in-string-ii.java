class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // if same character already on top
            if (!stack.isEmpty() && stack.peek()[0] == ch) {

                stack.peek()[1]++;

                // remove when frequency becomes k
                if (stack.peek()[1] == k) {
                    stack.pop();
                }

            } else {

                // push new character with count 1
                stack.push(new int[]{ch, 1});
            }
        }

        // build final answer
        StringBuilder ans = new StringBuilder();

        for (int[] pair : stack) {

            char ch = (char) pair[0];
            int freq = pair[1];

            while (freq-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}