class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
   
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
     
        Collections.sort(vowels);

 
        StringBuilder result = new StringBuilder();
        int vowelIdx = 0;
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(vowels.get(vowelIdx++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}