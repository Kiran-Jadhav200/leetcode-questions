class Solution {
    public int[] twoSum(int[] arr, int target) {
       
    
		int result[]=new int[2];
		
        int i = 0;
        int j = i+1;

        while( i < arr.length && j< arr.length){
        
        if(arr[i] + arr[j] == target){
                    
                   result[0] = i;
                    result[1] = j;
                    break;
        }
        j++;
        if(j == arr.length){
           i++;
            j = i+1;
            
        }


        }
		
		return result;
}
}