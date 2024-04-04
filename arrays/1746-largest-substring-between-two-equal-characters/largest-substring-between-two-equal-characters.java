class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] indices = new int[26];
        int maxlen = -1;
        // a->97 -97 ->0
        //b->98 -97  ->1
        for(int i =0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(indices[idx]>0){
                //the current char is repating one
                maxlen = Math.max(maxlen,i - indices[idx]);
            }
            else{
                //we are seeing this char for the first time
                indices[idx] =i+1;

            }

        }    return maxlen;
    }

}