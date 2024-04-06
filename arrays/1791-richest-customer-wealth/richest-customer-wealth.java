class Solution {
    public int maximumWealth(int[][] arr) {
        int money = Integer.MIN_VALUE;
        for(int i =0; i< arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>money){
                money = sum;
            }
        }
        return money;
        
    }
}