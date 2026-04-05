class Solution {
    public boolean isHappy(int n) 
    {
        int slow = n, fast = n;

        while (true)
        {
            slow = getSum(slow);              

            fast = getSum(fast);              
            fast = getSum(fast);              

            if (fast == 1) return true;       
            if (slow == fast) return false;   
        }
    }

    private int getSum(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            int a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        return sum;
    }
}