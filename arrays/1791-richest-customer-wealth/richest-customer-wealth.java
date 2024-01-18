class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            // when you start a new col take a new sum 
            int sum = 0;
            for( int account = 0; account< accounts[person].length;account++){
                    sum+= accounts[person][account];
            }

            //now we have sum of accouts of person
            if(sum> ans){
                ans = sum;
            }
        }
        return ans;
    }
}