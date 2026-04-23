class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            int need = sum - k;

            if (map.containsKey(need)) {
                res += map.get(need);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
}