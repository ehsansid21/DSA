class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int weekStart =1;
        int day = 0;
        while(day<n)
        {
            int daily = weekStart;
            for(int i = 0; i<7 && day <n;i++)
            {
                total+=daily;
                daily++;
                day++;
            }
            weekStart++;
        }
        return total;
    }
}