class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int[] freq = new int[k];
        freq[0] = 1;

        int prefix = 0;
        int ans = 0;

        for (int num : nums) {

            prefix += num;

            int rem = prefix % k;
            if (rem < 0) {
                rem += k;
            }

            ans += freq[rem];
            freq[rem]++;
        }

        return ans;
    }
}