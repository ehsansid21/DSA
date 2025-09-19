class Solution {
    public int lengthOfLastWord(String s) {
      
        String words[]=s.trim().split(" ");
        String last=words[words.length-1];
        int i=last.length();
        return i;
        
    }
}