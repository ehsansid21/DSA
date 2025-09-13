class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()) {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int maxVowel=0;
        int maxCons=0;
        for(char c:freq.keySet()) {
            int count =freq.get(c);
            if("aeiou".indexOf(c)!=-1) {
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxCons = Math.max(maxCons, count);
            }
        }
        return (maxVowel+maxCons);
    }
}