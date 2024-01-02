class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }
        
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                end = j;
                break;
            }
        }
        
        return new int[]{start, end};
    }
}
