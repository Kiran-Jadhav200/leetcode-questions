class Solution {
    public double averageWaitingTime(int[][] customers) {
        int start = customers[0][0];
        long wait =0;
        int end =0;
        for(int i=0; i<customers.length;i++){
            start = Math.max(start,customers[i][0]);
            end = start + customers[i][1];
            wait += end - customers[i][0];
            start = end;
        }
        double avg = (double)wait / customers.length;
        return avg;
    }
}