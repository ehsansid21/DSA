class Solution {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true),
                         binarySearch(nums, target, false)};
    }

    private int binarySearch(int[] nums, int target, boolean first) {

        int low = 0, high = nums.length - 1;
        int res = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                res = mid;

                if (first)
                    high = mid - 1;   // Search left for first occurrence
                else
                    low = mid + 1;    // Search right for last occurrence
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return res;
    }
}