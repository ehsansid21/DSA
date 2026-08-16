import java.util.*;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);  
        
        int prefix = 0;
        int ans = 0;
        
        for (int num : nums) {
            prefix += num;
            
            int rem = prefix % k;
            if (rem < 0) rem += k;   
            
            ans += freq.getOrDefault(rem, 0);// stores the freq of remainder 0
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}