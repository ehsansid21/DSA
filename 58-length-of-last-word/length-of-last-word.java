class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String words[]=s.split(" ");
        String last=words[words.length-1];
        int i=last.length();
        return i;
        
    }
}