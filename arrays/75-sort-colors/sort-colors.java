class Solution {
    public void sortColors(int[] nums) {
     int n=nums.length;
     int temp[]=new int[n];
     int j=0;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            temp[j++]=nums[i];
        }
     }
     for(int i=0;i<n;i++){
        if(nums[i]==1){
            temp[j++]=nums[i];
        }
     }
     for(int i=0;i<n;i++){
        if(nums[i]==2){
            temp[j++]=nums[i];
        }
     }
     if(n==1){
        return;
     }

System.arraycopy(temp,0,nums,0,temp.length);
    }
}