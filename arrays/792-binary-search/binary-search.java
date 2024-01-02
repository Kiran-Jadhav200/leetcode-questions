class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                break; // Add break to exit the loop once the target is found
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
