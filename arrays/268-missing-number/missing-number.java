class Solution {
    public int missingNumber(int[] arr) {
       int i =0; 
       while(i<arr.length){
        int correct = arr[i];
        if(arr[i]< arr.length && arr[i] != arr[correct]){
            swap(arr,i,correct);
        }
        else{
            i++;

        }
       }
        for(int k =0; k<arr.length; k++ ){
            if(arr[k] != k){
                return k;
            }
        }
        return arr.length;


    }
    
    static void swap(int[] arr, int first, int last){
        int temp =arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    } 
}