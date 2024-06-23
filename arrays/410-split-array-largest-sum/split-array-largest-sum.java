class Solution {
    public int splitArray(int[] nums, int k) {
            int start = 0; int end =0; int n = nums.length;
    for(int i = 0; i<n; i++){
        start = Math.max(start,nums[i]);// in the end of the loop this will contain the max item form the array;
        end += nums[i];
    }
    // binary search
        while(start < end){
// try for the middle as potential ans
            int mid= start + (end -start) /2;


            //caluclate how many pieces you cam divide this with max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum +num > mid){
                    // you cannot add htis in this subarray make new one
                    // say you add this num in subarray  then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }

            if(pieces > k){
                start = mid +1;
            }
            else end = mid;
        }
        return end; // here start == end;
    }
}