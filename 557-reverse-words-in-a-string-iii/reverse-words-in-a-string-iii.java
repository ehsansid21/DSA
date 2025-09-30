class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int n= words.length;
        StringBuilder result = new StringBuilder();

        for(int i =0;i<n;i++)
        {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            result.append(reversed);
            if(i < n-1) 
            result.append(" ");
        }

        return result.toString();
    }
}