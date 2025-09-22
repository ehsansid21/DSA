class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxFreq=0;
        for(int count :freq.values())
        {
            if(count>maxFreq)
            {
                maxFreq=count;
            }
        }
        int total = 0;
        for (int count : freq.values()) {
            if (count == maxFreq) {
            total += count;
    }
}
return total;
       
    }
}