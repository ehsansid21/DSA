class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int num:nums)
        {
            high=Math.max(high,num);
        }
        while(low<high)
        {
            int mid=(low+high)/2;
            if(sum(nums,mid)<=threshold)
            high=mid;
            else
            low=mid+1;
        }
        return low;
    }
    int sum(int nums[],int divisor)
    {
        int sum=0;
        for(int num:nums)
        sum+=Math.ceil((double)num/divisor);
        return sum;
    }
}