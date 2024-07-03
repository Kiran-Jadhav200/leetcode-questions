class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 4) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            result = Math.min(result, nums[n - 4] - nums[0]);
            result = Math.min(result, nums[n - 3] - nums[1]);
            result = Math.min(result, nums[n - 2] - nums[2]);
            result = Math.min(result, nums[n - 1] - nums[3]);
        }
        return result;
    }
}