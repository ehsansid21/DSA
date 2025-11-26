class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int [][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0]=score[i];
            pairs[i][1]=i;
        }
        java.util.Arrays.sort(pairs,(a,b)-> b[0]-a[0]);
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            int idx=pairs[i][1];
            if(i==0) answer[idx] = "Gold Medal";
            else if (i==1) answer[idx] = "Silver Medal";
            else if (i==2) answer[idx] = "Bronze Medal";
            else answer[idx] = String.valueOf(i+1);
        }
        return answer;
    }
}