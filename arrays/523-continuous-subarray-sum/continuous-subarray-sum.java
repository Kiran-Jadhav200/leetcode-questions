class Solution {
public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> modIndex = new HashMap<>();
        modIndex.put(0, -1);

        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int mod = currentSum % k;

            // Handle negative mod, adjust
            if (mod < 0) {
                mod += k;
            }

            if (modIndex.containsKey(mod)) {
                int oldIndex = modIndex.get(mod);
                // Ensure the subarray length is at least 2
                if (i - oldIndex > 1) {
                    return true;
                }
            } else { //I didn't use this else it failed for [5,0,0,0] and k=3
                modIndex.put(mod, i);
            }
        }
        return false;
    }
}