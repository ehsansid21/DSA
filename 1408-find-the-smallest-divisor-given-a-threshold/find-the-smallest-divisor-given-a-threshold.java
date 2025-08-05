class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1; 
        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        int j = high; 

        while (low <= high) {
            int mid = (low + high) / 2; 
            int sum = 0; 

            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double) nums[i] / mid);
            }

            if (sum <= threshold) {
                j = mid;     
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return j;
    }
}
