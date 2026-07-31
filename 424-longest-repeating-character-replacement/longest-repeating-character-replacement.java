import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Update maximum frequency
            maxFreq = Math.max(maxFreq, map.get(ch));

            // Shrink window if invalid
            while ((right - left + 1) - maxFreq > k) {

                char remove = s.charAt(left);

                map.put(remove, map.get(remove) - 1);

                left++;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}