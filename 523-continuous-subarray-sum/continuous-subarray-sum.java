class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // remainder 0 exists before the array starts
        map.put(0, -1);

        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];

            int rem = prefix % k;

            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {

                // subarray must contain at least 2 elements
                if (i - map.get(rem) >= 2) {
                    return true;
                }

            } else {
                // Store only the FIRST occurrence
                map.put(rem, i);
            }
        }

        return false;
    }
}