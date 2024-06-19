class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end= arr.length-1;
        while(start< end){
            int mid = start + (end -start) /2;
            if(arr[mid]> arr[mid+1]){
                // you are in dec part of the array
                // this is may be the ans but look at left
                // this is why end != mid -1;
                end = mid;
            }
            else {
                // you are asc part of array
                start = mid+1; // becaue we know that mid+1 element > mid elements

            }
        }
        return start;

    }
}