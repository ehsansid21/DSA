class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int[] diff = new int[n+2];

        // Apply range updates
        for (int[] booking : bookings) {

            int start = booking[0];
            int end = booking[1];
            int value = booking[2];

            diff[start] += value;
            diff[end + 1] -= value;
        }

        // Convert difference array to actual array
        int[] ans = new int[n];

        int current = 0;

        for (int i = 1; i <= n; i++) {

            current += diff[i];
            ans[i-1] = current;
        }

        return ans;
    }
}
        
   