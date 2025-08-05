class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int p = 0, j = 0;
        int arr2[] = new int[1000]; 
        for (int i = 1; j < 1000; i++) { 
            if (p < n && arr[p] == i) {  
                p++; 
            } else {
                arr2[j] = i; 
                j++;
            }
        }
        return arr2[k - 1]; 
    }
}
