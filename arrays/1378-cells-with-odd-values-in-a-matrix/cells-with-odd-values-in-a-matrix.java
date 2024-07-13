class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int len = indices.length;
        for(int i =0; i< len; i++){ //i=0
            for(int j =0; j<n;j++){//j= 0
                ans[indices[i][0]][j]++; // 
            }
            for(int j =0; j<m;j++){
                ans[j][indices[i][1]]++;
            }
        }
        int cnt =0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(ans[i][j]%2!=0)
                cnt++;
            }
        }
        return cnt;

    }
}