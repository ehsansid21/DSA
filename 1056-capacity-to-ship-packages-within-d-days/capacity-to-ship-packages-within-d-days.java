class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight : weights)
        {
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<high)
        {
            int mid=(low+high)/2;
            if(daysNeeded(weights,mid)<=days)
            high=mid;
            else
            low=mid+1;
        }
        return low;
    }
    int daysNeeded(int[] weights,int capacity)
    {
        int days=1;
        int currentWeight=0;
        for(int weight:weights)
        {
            if(currentWeight+weight>capacity)
            {
            days++;
            currentWeight=0;
        }
        currentWeight+=weight;
        }
        return days;
    }
}