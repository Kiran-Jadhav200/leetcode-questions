class Solution {
    public int[] getConcatenation(int[] nums) {
        
         int newarr[] = new int[(nums.length*2)];
         int ans[] = ans(nums,newarr,0,0);
        return ans;
        }

        int[]  ans(int[] nums,int newarr[], int n,int i){
            if(n>(nums.length*2)-1){
                return newarr;
            }
            if(i>=nums.length){
                i=0;
            }
            newarr[n] = nums[i];
            
            return ans(nums,newarr,n+1,i+1);
        }
    }