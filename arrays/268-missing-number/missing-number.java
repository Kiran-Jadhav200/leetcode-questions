class Solution {
    public int missingNumber(int[] nums) 
    {
        int s =0;
        int m = nums.length;
        for (int n : nums)
        {
            s+=n;
        }
        return (m*(m+1))/2-s;
    }
}