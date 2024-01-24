class Solution {
    public int largestAltitude(int[] gain) {
        int maximum = 0;
        int sum = 0;
        for(int i =0; i< gain.length;i++){
            sum+= gain[i];
            maximum = Math.max(maximum,sum);
        } 
        return maximum;
    }
}