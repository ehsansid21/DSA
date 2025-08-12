class Solution {
    public int maxDepth(String s) {
        int counter=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {counter++;
            max=Math.max(max,counter);}
            if(s.charAt(i)==')')
            counter--;
        }
        return max;
    }
}