class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       // Create an array to store the target array
    int[] target = new int[nums.length];

    // Iterate over the nums and index arrays
    for (int i = 0; i < nums.length; i++) {
        // Shift elements to the right to make space for the new element
        for (int j = nums.length - 1; j > index[i]; j--) {
            target[j] = target[j - 1];
        }
        // Insert the current element from nums at the specified index in target
        target[index[i]] = nums[i];
    }

    return target;

    }
}