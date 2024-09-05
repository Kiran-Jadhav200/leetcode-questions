class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = 0;
        
        for(int num : rolls) sum += num;

        int remSum = (mean * (n + rolls.length)) - sum;

        if(remSum > 6*n || remSum < n) return new int[]{};

        int distMean = remSum / n; // consider i equally divide everything

        int[] result = new int[n];

        for(int i = 0; i < n; i++) result[i] = distMean;

        // but there may be error (int , float based)

        int mod = remSum % n; // extra numbers left;

        for(int i =0; i < mod; i++) result[i]++; // just add 1 to those elements

        return result;

    }
}