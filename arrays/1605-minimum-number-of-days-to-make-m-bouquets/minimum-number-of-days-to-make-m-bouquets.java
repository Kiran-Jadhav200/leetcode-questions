class Solution {
    private boolean isPossible(int[] arr,int days,int k,int m){
        int n = arr.length;
        int cnt = 0;
        for(int i = 0;i < n;){
            int remain = n - i;
            if(remain < k) break;
            boolean flag = true;
            for(int j = i;j < i + k && j < n;j++){
                if(arr[j] > days){
                    i = j + 1;
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt++;
                i = i + k;
            }
        }
        return cnt >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0;
        int end = 0;
        for(int i : bloomDay){
            end = Math.max(i,end);
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isPossible(bloomDay,mid,k,m)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ans;
    }
}