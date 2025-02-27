class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
       int i =0;
       while (i<arr.length){
           int correct = arr[i]-1;
           if(arr[i]!= arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;
           }
       }

       //just find the missing  numbers
       List<Integer> ans = new ArrayList<>();
       for (int j = 0; j < arr.length ; j++) {
           if(arr[j]!= j+1){
            ans.add(j+1);
           }
       }
    return ans;
    }


     void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}