class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) 
        return false;
        String q=s+s;
        return q.contains(goal);
        
    }
}