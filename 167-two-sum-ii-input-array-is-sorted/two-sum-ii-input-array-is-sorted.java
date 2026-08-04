class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int left =0;
        int right=n-1;int sum=0;
        while(left<right)
        {
        if((numbers[left]+numbers[right]) == target)
        return new int []{left+1,right+1};
        sum=numbers[left]+numbers[right];
        if(sum > target)
        right--;
        else 
        left++;
        }
        return new int[]{};
    }
}
