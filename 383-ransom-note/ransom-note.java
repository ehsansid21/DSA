import java.util.HashMap;

class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> magFreq = new HashMap<>();
        HashMap<Character, Integer> ranFreq = new HashMap<>();

        // Frequency of magazine
        for (char ch : magazine.toCharArray()) {
            magFreq.put(ch, magFreq.getOrDefault(ch, 0) + 1);
        }

        // Frequency of ransomNote
        for (char ch : ransomNote.toCharArray()) {
            ranFreq.put(ch, ranFreq.getOrDefault(ch, 0) + 1);
        }

        // Compare frequencies
        for (char ch : ranFreq.keySet()) {

            int needed = ranFreq.get(ch);
            int available = magFreq.getOrDefault(ch, 0);

            if (needed > available) {
                return false;
            }
        }

        return true;
    }
}