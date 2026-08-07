class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Not enough flowers
        if ((long) m * k > bloomDay.length)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, mid, m, k))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    boolean canMake(int[] bloomDay, int day, int m, int k) {

        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            }
            else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}

