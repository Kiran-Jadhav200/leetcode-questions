class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arrSize = original.length;
        if(m*n != arrSize || arrSize / n != m ){
            return new int[][]{};
        }
        int[][] res = new int[m][n];
        int k = 0;
        for(int i = 0 ; i<m; i++){
            for(int j = 0; j<n; j++){
                res[i][j] = original[k];
                k++;
            }
        }
        return res;
    }
}