class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n =image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        for(int i =0; i<n;i++){
            for(int j =0; j<image[i].length;j++){
               ans[i][j] = image[i][image[i].length -1 -j]^1;
            }
        }
        return ans;
    }
}