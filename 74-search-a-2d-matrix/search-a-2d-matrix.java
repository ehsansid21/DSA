class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n1 = matrix.length;        
        int n2 = matrix[0].length;     
        boolean found = false;        

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    return true;       
                }
            }
        }

        return found;
    }
}
