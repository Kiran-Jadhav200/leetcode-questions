class Solution {
    public int maxSatisfied(int[] C, int[] G, int M) {
        int sum  = 0;
        int n = C.length;

        for(int i=0; i<n; i++){
            // check all the grumpy ones and gonna add 
            if(G[i]==0){
                sum+=C[i];
            }
        }

        int ans = Integer.MIN_VALUE;

        int st = 0;
        for(int i = M-1; i<n; i++){
            int temp = sum;
            // subs. grumpy one from the window 
            for(int j = st; j<= i; j++){
                if(G[j]==0){
                    temp-=C[j];
                }

                temp+=C[j];
            }


            // add all windows elements 


            // update the ans 

            ans = Math.max(temp, ans);
            st++;
        }

        return ans; 


    }
}